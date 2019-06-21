

package com.ssong.themom

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

class RankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_rank, null)

        val mSpinner: Spinner = view.findViewById(R.id.spinner)
        val myStrings = mutableListOf("유모차", "Two", "Three", "Four", "Five")
        mSpinner.adapter = ArrayAdapter(this.activity, android.R.layout.simple_spinner_dropdown_item, myStrings)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}