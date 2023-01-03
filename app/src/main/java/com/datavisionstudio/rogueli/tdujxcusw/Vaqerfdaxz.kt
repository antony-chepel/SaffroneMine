package com.datavisionstudio.rogueli.tdujxcusw


import android.os.*
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.IOException
import android.content.Intent
import org.json.JSONException
import org.json.JSONObject

import android.content.pm.PackageManager
import android.net.Uri

import com.appsflyer.AppsFlyerLib

import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.qpols
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal

import com.orhanobut.hawk.Hawk
import android.app.Activity
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.reisjkakd


import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.tyridkmkcx


import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.osdkokxmczk
import android.provider.MediaStore

import android.util.Log
import android.webkit.*

import android.widget.Toast
import com.datavisionstudio.rogueli.R
import com.datavisionstudio.rogueli.databinding.ActivityXujsywsaBinding





class Vaqerfdaxz : AppCompatActivity() {
    lateinit var deoosa: ActivityXujsywsaBinding

    var ysuxijjxc: ValueCallback<Array<Uri>>? = null

    lateinit var miodkuchv: WebView

    private val qposlxzcmiw = 1

    var bhvuoodlas: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        deoosa = ActivityXujsywsaBinding.inflate(layoutInflater)
        setContentView(deoosa.root)

        miodkuchv = deoosa.xdisox
        Snackbar.make(
            deoosa.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val guysoxkckos = CookieManager.getInstance()
        guysoxkckos.setAcceptCookie(true)
        guysoxkckos.setAcceptThirdPartyCookies(miodkuchv, true)
        isdjsjixkc()
        val cdereosa: Activity = this
        miodkuchv.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(ferospa: WebView, vgtfusd: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(vgtfusd)) {
                        return false
                    }
                    if (risoa(vgtfusd)) {

                        val btreloskxzs = Intent(Intent.ACTION_VIEW)
                        btreloskxzs.data = Uri.parse(vgtfusd)
                        startActivity(btreloskxzs)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                ferospa.loadUrl(vgtfusd)
            }


            override fun onPageFinished(aqaos: WebView, deopslx: String) {
                super.onPageFinished(aqaos, deopslx)
                cdxkzs(deopslx)
            }

            override fun onReceivedError(
                ydiadsjx: WebView,
                huyguijsidjxn: Int,
                xsopxllsmcxmlcz: String,
                sjajdodj: String
            ) {
                Toast.makeText(cdereosa, xsopxllsmcxmlcz, Toast.LENGTH_SHORT).show()
            }


        }
        miodkuchv.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                gikodks: WebView, vgfyus: ValueCallback<Array<Uri>>,
                wposlxkcx: FileChooserParams
            ): Boolean {
                ysuxijjxc?.onReceiveValue(null)
                ysuxijjxc = vgfyus
                var vhfyaijdjas: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (vhfyaijdjas!!.resolveActivity(packageManager) != null) {

                    var dopoposokdxm: File? = null
                    try {
                        dopoposokdxm = uycjjv()
                        vhfyaijdjas.putExtra("PhotoPath", bhvuoodlas)
                    } catch (ex: IOException) {

                    }


                    if (dopoposokdxm != null) {
                        bhvuoodlas = "file:" + dopoposokdxm.absolutePath
                        vhfyaijdjas.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(dopoposokdxm)
                        )
                    } else {
                        vhfyaijdjas = null
                    }
                }
                val ookdfkox = Intent(Intent.ACTION_GET_CONTENT)

                ookdfkox.addCategory(Intent.CATEGORY_OPENABLE)

                ookdfkox.type = "image/*"

                val guujdsijinxc: Array<Intent?> =
                    vhfyaijdjas?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val xsoxopxc = Intent(Intent.ACTION_CHOOSER)
                xsoxopxc.putExtra(Intent.EXTRA_INTENT, ookdfkox)

                xsoxopxc.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))

                xsoxopxc.putExtra(Intent.EXTRA_INITIAL_INTENTS, guujdsijinxc)

                startActivityForResult(
                    xsoxopxc, qposlxzcmiw
                )
                return true
            }


            @Throws(IOException::class)
            private fun uycjjv(): File {
                var roopsdkl = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!roopsdkl.exists()) {
                    roopsdkl.mkdirs()
                }


                roopsdkl =
                    File(roopsdkl.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return roopsdkl
            }

        }

        miodkuchv.loadUrl(hyuivi())
    }
    private fun ysdgydsgy(sidjix: String) {

        OneSignal.setExternalUserId(
            sidjix,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(giokd: JSONObject) {
                    try {
                        if (giokd.has("push") && giokd.getJSONObject("push").has("success")) {
                            val njcixioood = giokd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $njcixioood"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (giokd.has("email") && giokd.getJSONObject("email").has("success")) {
                            val vgfyusidif =
                                giokd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vgfyusidif"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (giokd.has("sms") && giokd.getJSONObject("sms").has("success")) {
                            val firodpsp = giokd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $firodpsp"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun hyuivi(): String {

        val yopdlfm = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val bhjucvvci: String? = Hawk.get(osdkokxmczk, "null")
        val eoos: String? = Hawk.get(tyridkmkcx, "null")

        val vijidjijianmxmck:String? = Hawk.get(qpols, "null")




        val eooskdkx = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val woso = "naming"
        val vkkcxo = "deeporg"
        val qposldkxcm = "ad_id="
        val hufioodsf = Build.VERSION.RELEASE
        val afrtasxc = "sub_id_5="
        val fiijdjkxc = "com.datavisionstudio.rogueli"
        val vjvubhvhixcood = "deviceID="
        val bkviocvobksw = "sub_id_4="



        val qwoplskc = "sub_id_6="


        val eiosod = "sub_id_1="

        val fiijsidmxkcmkzmk = Hawk.get(reisjkakd, "null")

        var sauidijixcji = ""
        if (vijidjijianmxmck != "null"){
            sauidijixcji = "$fiijsidmxkcmkzmk$eiosod$vijidjijianmxmck&$vjvubhvhixcood$eooskdkx&$qposldkxcm$bhjucvvci&$bkviocvobksw$fiijdjkxc&$afrtasxc$hufioodsf&$qwoplskc$woso"
            ysdgydsgy(eooskdkx.toString())
        } else {
            sauidijixcji = "$fiijsidmxkcmkzmk$eiosod$eoos&$vjvubhvhixcood$eooskdkx&$qposldkxcm$bhjucvvci&$bkviocvobksw$fiijdjkxc&$afrtasxc$hufioodsf&$qwoplskc$vkkcxo"
            ysdgydsgy(eooskdkx.toString())
        }

        Log.d("TESTAG", "Test Result $sauidijixcji")
        return yopdlfm.getString("SAVED_URL", sauidijixcji).toString()
    }

    private fun risoa(cvockx: String): Boolean {

        val eooskdolx = packageManager
        try {

            eooskdolx.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun isdjsjixkc() {
        val disajxjicnz = miodkuchv.settings
        disajxjicnz.builtInZoomControls = true

        disajxjicnz.setAppCacheEnabled(true)
        disajxjicnz.javaScriptCanOpenWindowsAutomatically = true

        disajxjicnz.setSupportMultipleWindows(false)

        disajxjicnz.pluginState = WebSettings.PluginState.ON

        disajxjicnz.javaScriptEnabled = true
        disajxjicnz.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW


        disajxjicnz.loadWithOverviewMode = true

        disajxjicnz.displayZoomControls = false

        disajxjicnz.userAgentString = disajxjicnz.userAgentString.replace("; wv", "")
        disajxjicnz.allowFileAccess = true
        disajxjicnz.setSupportZoom(true)
        disajxjicnz.useWideViewPort = true


        disajxjicnz.allowContentAccess = true

        disajxjicnz.domStorageEnabled = true



    }



    var eosoodkox = ""
    fun cdxkzs(woeoksd: String?) {
        if (!woeoksd!!.contains("t.me")) {

            if (eosoodkox == "") {
                eosoodkox = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    woeoksd
                ).toString()

                val vokcox = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val eoksaodx = vokcox.edit()
                eoksaodx.putString("SAVED_URL", woeoksd)
                eoksaodx.apply()
            }
        }
    }



    override fun onActivityResult(vkcoxo: Int, eosokd: Int, civjxcvi: Intent?) {
        if (vkcoxo != qposlxzcmiw || ysuxijjxc == null) {
            super.onActivityResult(vkcoxo, eosokd, civjxcvi)
            return
        }
        var sudashhxijcjiz: Array<Uri>? = null


        if (eosokd == AppCompatActivity.RESULT_OK) {
            if (civjxcvi == null || civjxcvi.data == null) {
                sudashhxijcjiz = arrayOf(Uri.parse(bhvuoodlas))
            } else {
                val ioplknnchd = civjxcvi.dataString
                if (ioplknnchd != null) {
                    sudashhxijcjiz = arrayOf(Uri.parse(ioplknnchd))
                }
            }
        }
        ysuxijjxc?.onReceiveValue(sudashhxijcjiz)
        ysuxijjxc = null
    }


    private var rooskodx = false
    override fun onBackPressed() {


        if (miodkuchv.canGoBack()) {
            if (rooskodx) {
                miodkuchv.stopLoading()
                miodkuchv.loadUrl(eosoodkox)
            }
            this.rooskodx = true
            miodkuchv.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                rooskodx = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }





}