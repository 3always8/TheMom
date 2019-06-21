package com.ssong.themom

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MypageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_mypage, null)
        return view
    }

    override fun onResume() {
//        activity?.toolbar?.visibility = View.GONE
        //activity?.toolbar?.collapseActionView()
//        activity?.toolbar?.scaleY = 0F

        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}