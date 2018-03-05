package com.peopleline.totalsilencer.Services

import android.app.IntentService
import android.content.Intent

/**
 * Created by dsavin on 2018-02-14.
 */
class BackgroundSilencer() : IntentService("BackgroundSilencer")
{
    override fun onCreate()
    {
        super.onCreate()
    }
    override fun onHandleIntent(intent: Intent?)
    {
        val myIntent = BackgroundSilencerIntent(intent)

        if(myIntent.needToStart)
        {
            //start service
        }
    }
}