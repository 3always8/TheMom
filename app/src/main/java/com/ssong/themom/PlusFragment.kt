package com.ssong.themom

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PlusFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true


/*
        var mDatabase = FirebaseDatabase.getInstance().reference
        mDatabase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                for (snapshot in dataSnapshot.children) {
                    Log.d("MainActivity", "ValueEventListener : " + snapshot.value!!)
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        })
*/


//        mDatabase.orderByKey().addListenerForSingleValueEvent(itemListener)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_plus, null)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}

