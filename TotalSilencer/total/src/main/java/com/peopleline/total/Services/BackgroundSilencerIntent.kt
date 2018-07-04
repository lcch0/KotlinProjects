package com.peopleline.total.Services

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable

/**
 * Created by dsavin on 2018-02-14.
 */

class BackgroundSilencerIntent() : Intent()
{
    var isChecked: Byte = 0

    constructor(parcel: Parcel) : this()
    {
        isChecked = parcel.readByte()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int)
    {
        super.writeToParcel(parcel, flags)
        parcel.writeByte(isChecked)
    }

    override fun describeContents(): Int
    {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BackgroundSilencerIntent>
    {
        override fun createFromParcel(parcel: Parcel): BackgroundSilencerIntent
        {
            return BackgroundSilencerIntent(parcel)
        }

        override fun newArray(size: Int): Array<BackgroundSilencerIntent?>
        {
            return arrayOfNulls(size)
        }
    }
}