package com.ssong.themom

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser



class LoginSNSActivity : AppCompatActivity() {

/*
    private var mFirebaseAuth: FirebaseAuth? = null
    private var mFirebaseUser: FirebaseUser? = null
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sns)

/*
        mFirebaseAuth = FirebaseAuth.getInstance()
        mFirebaseUser = mFirebaseAuth?.currentUser!!

        if (mFirebaseUser == null) {
            val intent = Intent(applicationContext, SigninEmailActivity::class.java)
            startActivity(intent)
            finish()
            return
        } else {
            var mUsername = mFirebaseUser?.displayName
            val mPhotoUrl = mFirebaseUser?.photoUrl!!.toString()

        }
*/

    }

}
