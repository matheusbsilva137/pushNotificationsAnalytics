package com.digitalhouse.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fba: FirebaseAnalytics = Firebase.analytics
        fba.logEvent(FirebaseAnalytics.Event.SELECT_ITEM){
            param(FirebaseAnalytics.Param.ITEM_NAME, "Caneta Preta")
        }
    }
}