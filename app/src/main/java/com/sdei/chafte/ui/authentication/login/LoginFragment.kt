package com.sdei.chafte.ui.authentication.login

import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import com.facebook.*

import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordActivity
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.utils.base.BaseFragment
import org.json.JSONException
import java.util.*
import com.facebook.FacebookException

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod

import com.facebook.GraphResponse

import org.json.JSONObject

import com.facebook.GraphRequest



import com.facebook.FacebookCallback

import com.facebook.CallbackManager
import com.facebook.login.LoginManager

import java.lang.NullPointerException
import com.facebook.AccessToken
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.text.ParseException
import java.text.SimpleDateFormat

/**
 * Created by Vishal Sharma on 2019-12-06.
 */
class LoginFragment : BaseFragment<FragmentLoginBinding, LoginVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_login
    override var viewModel: LoginVM
        get() = setUpVM(activity as AuthenticationActivity, LoginVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentLoginBinding
        get() = setUpBinding()
        set(value) {}


    lateinit var callbackManager: CallbackManager

    lateinit var mGoogleSignInClient: GoogleSignInClient
    private val RC_SIGN_IN = 1


    override fun bindData() {
        binding.vm = viewModel

        binding.txRegister.setOnClickListener {
            navigateActivity(RegistrationActivity(), null)
        }
        binding.txForgotPassword.setOnClickListener {
            navigateActivity(ForgotPasswordActivity(), null)
        }

        binding.imgShowHidePassword.setOnClickListener {
            if(binding.imgShowHidePassword.drawable.constantState!!.equals(resources.getDrawable(R.drawable.show_button).constantState)){
                binding.edPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                binding.imgShowHidePassword.setImageDrawable(resources.getDrawable(R.drawable.ic_full_eye))
            } else{
                binding.edPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                binding.imgShowHidePassword.setImageDrawable(resources.getDrawable(R.drawable.show_button))
            }}

        viewModel.observerLoginResponse()?.observe (this, Observer {
            Log.e("response_id",""+it.id)
            baseActivity.saveData(SessionManager.FIRST_NAME,it.fname)
            baseActivity.saveData(SessionManager.USER_ID,it.id)
            baseActivity.saveData(SessionManager.AUTHENTICATION,it.accessToken)
            baseActivity.saveData(SessionManager.USER_IMAGE,it.profileImg.image)
            val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(HomeActivity(),bundle)
            baseActivity.finish()
        })

        viewModel.observerGmailLoginResponse()?.observe (this, Observer {
            Log.e("response_id",""+it.id)
            baseActivity.saveData(SessionManager.USER_ID,it.id)
            baseActivity.saveData(SessionManager.FIRST_NAME,it.fname)
            baseActivity.saveData(SessionManager.AUTHENTICATION,it.accessToken)
            baseActivity.saveData(SessionManager.USER_IMAGE,it.profileImg.image)
            val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(HomeActivity(),bundle)
            baseActivity.finish()
        })

    }

  /*  fun setDateInterval (start: String ,duration: String,date: String): String? {

    }*/

    override fun initListeners() {

        val gsoNew = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(requireActivity(), gsoNew)

        binding.signInButton.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        binding.goodleImage.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
            /*val account = GoogleSignIn.getLastSignedInAccount(requireContext())
            if(account==null || account.isExpired) {
                val signInIntent = mGoogleSignInClient.signInIntent
                startActivityForResult(
                    signInIntent, RC_SIGN_IN
                )
            }*/
        }
        FacebookSdk.sdkInitialize(baseActivity.applicationContext);
        callbackManager = CallbackManager.Factory.create()

        LoginManager.getInstance().registerCallback(callbackManager, object : FacebookCallback<LoginResult?> {
            override fun onSuccess(loginResult: LoginResult?) {
                Log.e("Success", "Login")
                val request = GraphRequest.newMeRequest(
                    loginResult?.accessToken,
                    object : GraphRequest.GraphJSONObjectCallback {
                        override fun onCompleted(
                            `object`: JSONObject?,
                            response: GraphResponse?
                        ) {
                            if (`object` != null) {
                                Log.e("Success", ""+`object`.toString())

                                try {
                                    val name = `object`.getString("name")
                                    val email = `object`.getString("email")
                                    val fbUserID = `object`.getString("id")
                                    val fbFirstName = `object`.getString("firstName")
                                    val fbLastName = `object`.getString("lastName")
                                   // val fbProfile = `object`.getJSONObject("picture").getJSONObject("data").getString("url")
                                    val fbUsername = `object`.getString("username")
                                    var fbProfile=""
                                    val profile : Profile = Profile.getCurrentProfile()
                                    if (profile != null) {
                                        fbProfile = profile.getProfilePictureUri(100, 100).toString()
                                    }
                                    Log.e("name",name+" email "+email+" id "+fbUserID+" firstname "
                                            +fbFirstName+" Lastname "+fbLastName+" profile "+fbProfile)

                                    disconnectFromFacebook()
                                    viewModel.doGmailLoginProcess("User",email,fbFirstName,"",fbLastName,fbUserID,fbUserID,profile.toString(),"Facebook")

                                    // do action after Facebook login success
                                    // or call your API
                                } catch (e: JSONException) {
                                    e.printStackTrace()
                                } catch (e: NullPointerException) {
                                    e.printStackTrace()
                                }
                            }
                        }
                    })
                val parameters = Bundle()
                parameters.putString(
                    "fields",
                    "id, name, email, first_name,last_name,gender, birthday"
                )
                request.parameters = parameters
                request.executeAsync()
            }

            override fun onCancel() {
                Toast.makeText(baseActivity.mContext, "Login Cancel", Toast.LENGTH_LONG).show()
            }

            override fun onError(exception: FacebookException) {
                Toast.makeText(baseActivity.mContext, exception.message, Toast.LENGTH_LONG)
                    .show()
            }
        })

        binding.facebookImage.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(
                activity,
                Arrays.asList("public_profile", "email","user_friends")
            )
        }
    }

    fun disconnectFromFacebook() {
        if (AccessToken.getCurrentAccessToken() == null) {
            return  // already logged out
        }
        GraphRequest(
            AccessToken.getCurrentAccessToken(),
            "/me/permissions/",
            null,
            HttpMethod.DELETE
        ) { LoginManager.getInstance().logOut() }
            .executeAsync()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode === RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        } else {
            callbackManager.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(
                ApiException::class.java
            )
            // Signed in successfully
            val googleId = account?.id ?: ""
            Log.e("Google ID", googleId)

            val googleFirstName = account?.givenName ?: ""
            Log.e("Google First Name", googleFirstName)

            val googleLastName = account?.familyName ?: ""
            Log.e("Google Last Name", googleLastName)

            val googleEmail = account?.email ?: ""
            Log.e("Google Email", googleEmail)

            val googleProfilePicURL = account?.photoUrl.toString()
            Log.e("Google Profile Pic URL", googleProfilePicURL)

            val googleIdToken = account?.idToken ?: ""
            Log.e("Google ID Token", googleIdToken)

            viewModel.doGmailLoginProcess("User",googleEmail,googleFirstName,googleId,googleLastName,googleId,"",googleProfilePicURL,"Google")

        } catch (e: ApiException) {
            // Sign in was unsuccessful
            Log.e(
                "failed code=", e.statusCode.toString()
            )
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        LoginManager.getInstance().logOut()
    }
}