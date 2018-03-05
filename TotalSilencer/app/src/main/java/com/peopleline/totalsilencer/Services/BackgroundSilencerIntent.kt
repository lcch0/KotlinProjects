package com.peopleline.totalsilencer.Services

import android.content.Context
import android.content.Intent

/**
 * Created by dsavin on 2018-02-14.
 */

class BackgroundSilencerIntent
{
    private companion object IntentOptions
    {
        private const val IS_CHECKED = "com.peopleline.totalsilencer.Services::isChecked"

        var Intent.isChecked: Boolean?
            get() = getBooleanExtra(IS_CHECKED, false)
            set(value) { putExtra(IS_CHECKED, value) }
    }

    private var innerIntent: Intent? = null;

    constructor(context: Context)
    {
        intent = Intent(context, BackgroundSilencer::class.java)
    }

    constructor(i: Intent?)
    {
        intent = i
    }

    var needToStart: Boolean
        get() = intent?.isChecked == true
        set(value) { intent?.isChecked = value }

    var intent: Intent? = null
        private set(value){innerIntent = value}
}