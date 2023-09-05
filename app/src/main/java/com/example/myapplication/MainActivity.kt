package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.netperform.speedchecker.SpeedChecker
import com.example.netperform.speedchecker.SpeedCheckerConfiguration
import com.example.netperform.speedchecker.SpeedEvalParams
import com.example.netperform.speedchecker.TipsAndTricksConfig
import com.example.netperform.speedchecker.TipsAndTricksStyle
import com.example.react.netperform.VFGNetPerform


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun initializeNetperform() {
        VFGNetPerform.INSTANCE.init(
            applicationContext,
             VFGNetPerform.Environment.PRE_PRODUCTION
        )
    }


    fun setNetPerformConfig() {
        SpeedChecker.INSTANCE.setSpeedCheckerConfiguration {
            SpeedCheckerConfiguration(
                "447741861270",
                "Vodafone",
                SpeedEvalParams(1800L, 20000L),
                true,
                true,
                null,
                null,
                null,
                false,
                true,
                false,
                TipsAndTricksConfig(true, false, TipsAndTricksStyle("#383838", "#383838")),
                true
            )
        }
    }


}