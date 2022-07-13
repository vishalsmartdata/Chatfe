package com.sdei.chafte.utils

import android.Manifest.permission.*
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.media.ThumbnailUtils
import android.provider.MediaStore
import android.util.Log
import android.util.TimeFormatException
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.afollestad.assent.Permission
import com.afollestad.assent.askForPermissions
import com.afollestad.assent.runWithPermissions
import com.bumptech.glide.Glide
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.karumi.dexter.listener.single.PermissionListener
import com.sdei.chafte.R
import com.sdei.chafte.callback.PermissionCallback
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


/**
 * Picasso for image loading ...
 */
/*@BindingAdapter("loadImage", "placeholder")
fun xloadImages(
    view: ImageView?,
    image: String?,
    placeHolder: Int
) {
    image?.let {
        if (it.contains("http")) {
            Picasso.get()
                .load(it)
                .error(R.drawable.ic_launcher_background)
                .placeholder(placeHolder)
                .into(view)
        } else {
            val file = File(it)
            Picasso.get()
                .load(file)
                .error(placeHolder)
                .placeholder(placeHolder)
                .into(view)
        }
    } ?: run {
        Picasso.get()
            .load(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .into(view)
    }
}*/

@BindingAdapter("setUserProfImage")
fun setUserProfImage(imageView: ImageView, url: String?) {
    if(!url.isNullOrBlank()) {
        Picasso.get()
            .load(url)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)
    }else{
        Picasso.get()
            .load(R.drawable.ic_default_avatar)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)
    }

}

fun getDateShow(str: String): String? {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    dateFormat.timeZone = TimeZone.getTimeZone("GMT")  // IMP !!!
    try {
        var date= dateFormat.parse(str)
        val format = SimpleDateFormat("dd-MM-yyyy")
        return format.format(date)

    } catch (e: ParseException) {
        return null
    }
}

fun getDateWithServerTimeStamp(str: String): String? {
    val dateFormat = SimpleDateFormat(
        "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
        Locale.getDefault()
    )
    dateFormat.timeZone = TimeZone.getTimeZone("GMT")  // IMP !!!
    try {
        var date= dateFormat.parse(str)
        // val format = SimpleDateFormat("dd/MM/yyy HH:mm a")
        val format = SimpleDateFormat("HH:mm a")
        return format.format(date)

    } catch (e: ParseException) {
        return null
    }
}

fun getDateShowPerClient(str: String): String? {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    dateFormat.timeZone = TimeZone.getTimeZone("GMT")  // IMP !!!
    try {
        var date= dateFormat.parse(str)
        val format = SimpleDateFormat("MM/dd/yyyy")
        return format.format(date)

    } catch (e: ParseException) {
        return null
    }
}

public fun getCalculatedAge(year: Int, month: Int, day: Int): String? {
    val dob = Calendar.getInstance()
    val today = Calendar.getInstance()
    dob[year, month] = day
    var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
    /*if (today[Calendar.DAY_OF_YEAR] <= dob[Calendar.DAY_OF_YEAR]) {
        age--
    }*/
    val ageInt = age
    return ageInt.toString()
}


fun setDateInterval (start: String ,duration: Float,date: String): String? {
    val date = date.split("T").toTypedArray()[0]
    val time = start.toUpperCase()

    val dateString = date + time

    var dateAfterAddTime: Date? = null
    if(!dateString.contains(":")){
        val inputDate = SimpleDateFormat("yyyy-MM-ddhhaa").parse(dateString)
         dateAfterAddTime = Date(inputDate.time + (duration * 60 * 60 * 1000).toLong())
    }else{
        val otherDate = SimpleDateFormat("yyyy-MM-ddHH:mma").parse(dateString)
        dateAfterAddTime = Date(otherDate.time + (duration * 60 * 60 * 1000).toLong())
    }
    val format = SimpleDateFormat("h:mm")
    val cal = Calendar.getInstance()
    cal.setTime(dateAfterAddTime)
    val am_pm: Int = cal.get(Calendar.AM_PM)
    val amOrpm = if (am_pm == Calendar.AM) "AM" else "PM"
    var txt= format.format(dateAfterAddTime)
    return start+" - "+txt+amOrpm
}

fun getCalendarData (start: String ,date: String): Calendar {
    Log.e("starttime: ",start+" date: "+date)
    val date = date.split("T").toTypedArray()[0]
    val time = start.toUpperCase()
    var inputDate: Date? =null
    val dateString = date + time
    if(!dateString.contains(":")) {
         inputDate = SimpleDateFormat("yyyy-MM-ddhhaa").parse(dateString)
    }else{
        inputDate=  SimpleDateFormat("yyyy-MM-ddHH:mma").parse(dateString)
    }
    /*val dateAfterAddTime = Date(inputDate.time * 60 * 60 * 1000)
    val format = SimpleDateFormat("ha")

    var txt= format.format(dateAfterAddTime)*/
    val cal = Calendar.getInstance()
    cal.setTime(inputDate)
    return cal
}

/**
 * For Creating Video thumbnail from video URI ...
 */
fun createVideoThumbnail(context: Context, uri: String): File {
    Log.e("createVideoThumbnail", "" + uri)
    val bitmap =
        ThumbnailUtils.createVideoThumbnail(uri, MediaStore.Images.Thumbnails.MINI_KIND)
    return persistImage(context, bitmap, "thumbnail")
}

fun persistImage(context: Context, bitmap: Bitmap?, name: String): File {
    val filesDir = context.filesDir
    val imageFile = File(filesDir, "$name.jpg")

    val os: OutputStream
    try {
        os = FileOutputStream(imageFile) as OutputStream
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, os)
        os.flush()
        os.close()
    } catch (e: Exception) {
        Log.e("AppBinding", "Error writing bitmap", e)
    }

    return imageFile
}

/**
 * Function for Single Permission ...
 */
fun initSinglePermission(activity: Activity, permission: String, callback: PermissionCallback) {
    Dexter.withActivity(activity)
        .withPermission(permission)
        .withListener(object : PermissionListener {
            override fun onPermissionGranted(response: PermissionGrantedResponse?) {
                callback.onPermissionGranted()
            }

            override fun onPermissionRationaleShouldBeShown(
                permission: PermissionRequest?,
                token: PermissionToken?
            ) {

            }

            override fun onPermissionDenied(response: PermissionDeniedResponse?) {
                callback.onPermissionRejected()
            }
        }
        )
        .withErrorListener { error ->
            Log.e("Dexter", "There was an error: $error")
            callback.onPermissionRejected()
        }.check()
}

/**
 * Function for Multiple Permissions ...
 */
fun initMultiPermissions(activity: Activity, callback: PermissionCallback) {
    Dexter.withActivity(activity)
        .withPermissions(
            CAMERA,
            READ_CONTACTS,
            RECORD_AUDIO
        ).withListener(object : MultiplePermissionsListener {
            override fun onPermissionsChecked(report: MultiplePermissionsReport) {/* ... */
                callback.onPermissionGranted()
            }

            override fun onPermissionRationaleShouldBeShown(
                permissions: List<PermissionRequest>,
                token: PermissionToken
            ) {/* ... */
                callback.onPermissionRejected()
            }
        }).check()
}

fun checkMyPermission(baseActivity: BaseActivity<*, *>) {
    baseActivity.askForPermissions(Permission.WRITE_EXTERNAL_STORAGE, Permission.CAMERA,Permission.READ_CALENDAR,Permission.WRITE_CALENDAR) { result ->
        // Check the result, see the Using Results section
    }
}

fun runWithPermissions(baseActivity: BaseActivity<*, *>) {
    baseActivity.runWithPermissions(
        Permission.WRITE_EXTERNAL_STORAGE,
        Permission.CAMERA,
        Permission.READ_CALENDAR,
        Permission.WRITE_CALENDAR
    ) { result ->
        // Do something
    }
}

@SuppressLint("SetTextI18n")
@BindingAdapter("concatData")
fun concatData(view: TextView, concatData: String) {
    Log.e("sadfads","asasdfasdfadsfasd")
    view.text = "Item $concatData"
}

@BindingAdapter("selectedValue")
fun Spinner.setSelectedValue(selectedValue: Spinner) {
    return setSelectedValue(selectedValue)
}

fun setSpinnerValue(selectedValue: String) {

}











