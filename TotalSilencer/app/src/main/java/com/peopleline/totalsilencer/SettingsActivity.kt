package com.peopleline.totalsilencer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import com.peopleline.totalsilencer.Services.BackgroundSilencerIntent
import kotlinx.android.synthetic.main.activity_settings.*
import java.lang.ref.WeakReference

class SettingsActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        startBtn.setOnClickListener{ runBackgroundSilencer()}
    }

    private fun runBackgroundSilencer()
    {
        val bsintent = BackgroundSilencerIntent(this)
        bsintent.needToStart = startBtn?.isChecked == true

        this.startService(bsintent.intent);
    }
}
