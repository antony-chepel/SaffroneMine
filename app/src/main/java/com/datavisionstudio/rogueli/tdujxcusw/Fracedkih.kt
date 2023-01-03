package com.datavisionstudio.rogueli.tdujxcusw

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Fracedkih : Application() {
    companion object {
        var osdkokxmczk: String? = ""
        var reisjkakd = "link"
        const val vfyusa = "c206297b-aaea-4c5d-92b8-8ffcd7420bb2"
        var bgyud = "appsChecker"
        var qpols: String? = "c11"
        var tyridkmkcx: String? = "d11"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(vfyusa)

        Hawk.init(this).build()


    }
}