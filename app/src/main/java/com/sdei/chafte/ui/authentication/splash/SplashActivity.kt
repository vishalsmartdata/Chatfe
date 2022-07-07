package com.sdei.chafte.ui.authentication.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sdei.chafte.R
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
    init {
        Handler().postDelayed({
            val sessionManager = SessionManager(this)
            if(sessionManager.getvalue(SessionManager.USER_ID)!!.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("key", "login")
                var intent= Intent(this, HomeActivity::class.java).putExtras(bundle)
                startActivity(intent)
              //  startActivity(Intent(this, HomeActivity::class.java).putExtras("key",bundle))
            }else{
                startActivity(Intent(this, AuthenticationActivity::class.java))
            }

            finish()

        }, 2500)
    }
}