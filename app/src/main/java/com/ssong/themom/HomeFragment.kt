package com.ssong.themom

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class HomeFragment : Fragment() {

    lateinit var toyList: MutableList<Toy>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, null)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
/*

    private fun saveData(toyList:MutableList<Toy>) {
        for (toy in toyList) {
            val name = editTextView.text.toString().trim()

            if (name.isEmpty()) {
                editTextName.error = "Please enter name"
                return
            }

            //firebase
            val ref = FirebaseDatabase.getInstance().getReference("data")

// val ref = FirebaseDatabase.getInstance().reference   <-----you can use this too. it depends.
            val dataId = ref.push().key
            val data = ReviewClass(dataId!!, name, ratingBar.numStars)
            ref.child(dataId!!).setValue(data).addOnCompleteListener {
                Toast.makeText(applicationContext, "Data saved successfully", Toast.LENGTH_LONG).show()
            }
        }
    }

*/

}