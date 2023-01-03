package com.datavisionstudio.rogueli.ywqasxc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View
import com.datavisionstudio.rogueli.R
import com.datavisionstudio.rogueli.databinding.ActivityPosparafBinding
import kotlin.random.Random

class Posparaf : AppCompatActivity() {
    private var tsyudxi: CountDownTimer? = null

    private var lcxovpxcp = 15


    val usdjadis = listOf(
        "Points power : x2",
        "Points power : x5",
        "Points power : x10",
        "Points power : x20",
        "Points power : x30",
        "Points power : x50",
        "Points power : x100",
    )
    val eoosd = listOf(
        R.drawable.saff_1,
        R.drawable.saff_2,
        R.drawable.saff_3,
        R.drawable.saff_4,
        R.drawable.saff_5,
        R.drawable.saff_7,
    )
    private lateinit var gsdyyads : ActivityPosparafBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gsdyyads = ActivityPosparafBinding.inflate(layoutInflater)
        setContentView(gsdyyads.root)

        gsdyyads.vjicix.setImageResource(eoosd[Random.nextInt(6)])
        gsdyyads.chhx.setImageResource(eoosd[Random.nextInt(6)])
        gsdyyads.pdoasdo.setImageResource(eoosd[Random.nextInt(6)])
        gtydsiif()
        eposldlx()

    }

    @SuppressLint("ClickableViewAccessibility")
    private fun eposldlx() = with(gsdyyads){
        val moveListener = View.OnTouchListener(function = { foosdp, ris->
            if(ris.action == MotionEvent.ACTION_MOVE){
                foosdp.x = ris.rawX - foosdp.width/2
                foosdp.y = ris.rawY - foosdp.height/2
            }

            if(ris.action == MotionEvent.ACTION_DOWN){
                tvPower.text = usdjadis[Random.nextInt(7)]
            }

            true
        })
        chhx.setOnTouchListener(moveListener)
        pdoasdo.setOnTouchListener(moveListener)
        vjicix.setOnTouchListener(moveListener)
    }


    private fun gtydsiif() =with(gsdyyads){
        lcxovpxcp = 8
        tsyudxi?.cancel()
        tsyudxi = object : CountDownTimer(8000,1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                lcxovpxcp--
                if(lcxovpxcp >= 0) {
                    val count = lcxovpxcp.toString()
                    roosokdo.text = "Time : $count sec"

                    when(lcxovpxcp){
                        3-> roosokdo.setTextColor(resources.getColor(R.color.black))
                        2-> roosokdo.setTextColor(resources.getColor(R.color.black))
                        1-> roosokdo.setTextColor(resources.getColor(R.color.black))
                        0-> roosokdo.setTextColor(resources.getColor(R.color.black))
                    }
                }
            }

            override fun onFinish() {
                roosokdo.setTextColor(resources.getColor(R.color.white))
                if(lcxovpxcp==0){
                    lcxovpxcp = 10
                    startActivity(Intent(this@Posparaf,Nhysiixcus::class.java))
                    tsyudxi?.cancel()
                }


            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        tsyudxi?.cancel()
    }
}