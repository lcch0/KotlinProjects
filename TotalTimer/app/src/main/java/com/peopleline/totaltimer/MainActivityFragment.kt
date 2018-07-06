package com.peopleline.totaltimer

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment()
{
    private var _view: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _view = inflater.inflate(R.layout.fragment_main, container, false)
        return _view
    }
}
