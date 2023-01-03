package com.datavisionstudio.rogueli.ywqasxc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.datavisionstudio.rogueli.databinding.ActivityNhysiixcusBinding
import kotlin.random.Random

class Nhysiixcus : AppCompatActivity() {
    private lateinit var ksiox : ActivityNhysiixcusBinding
    val lissidi = listOf(
        "Power points : 120 exp",
        "Power points : 150 exp",
        "Power points : 180 exp",
        "Power points : 200 exp",
        "Power points : 250 exp",
        "Power points : 300 exp",
        "Power points : 500 exp",
        "Power points : 800 exp",
        "Power points : 1000 exp",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksiox = ActivityNhysiixcusBinding.inflate(layoutInflater)
        setContentView(ksiox.root)
        ksiox.tvRkd.text = lissidi[Random.nextInt(9)]
        ksiox.button2.setOnClickListener {
            startActivity(Intent(this,Posparaf::class.java))
        }

    }
}