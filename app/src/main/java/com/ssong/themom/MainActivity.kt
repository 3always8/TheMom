package com.ssong.themom

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {


    var toyDB: ToyDB? = null
    var toyList = mutableListOf<Toy>()
    var viewPager: ViewPager? = null
    var tabLayoutIconArray = arrayOf(R.drawable.icon_home, R.drawable.icon_search,R.drawable.icon_plus, R.drawable.icon_rank, R.drawable.icon_mypage)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //tablayout
        var tabLayout = findViewById<TabLayout>(R.id.tabs_main)
//      line under the current tab
        viewPager = findViewById<ViewPager>(R.id.viewPager)
        val adapter = ViewPageAdapter(supportFragmentManager)
        viewPager?.adapter = adapter


        var views = arrayOf(
            layoutInflater.inflate(R.layout.customtab, null),
            layoutInflater.inflate(R.layout.customtab, null),
            layoutInflater.inflate(R.layout.customtab, null),
            layoutInflater.inflate(R.layout.customtab, null),
            layoutInflater.inflate(R.layout.customtab, null))

        val r = Runnable{
            tabLayout.setupWithViewPager(viewPager)

            for (i in arrayOf(0,1,2,3,4)){
//                tabLayout.getTabAt(i)?.setIcon(tabLayoutIconArray[i])
                views[i].findViewById<ImageView>(R.id.icon).setBackgroundResource(tabLayoutIconArray[i])
                /*issue of not showing textview : just hiding under the homefragment.
                 Fixed by giving more height to tablayout.*/
//                views[i].findViewById<TextView>(R.id.fragment_title).text = adapter.getPageTitle(i)
                tabLayout.getTabAt(i)?.customView = views[i]
            }
        }
        tabLayout.postDelayed(r, 1000)



        toyDB = ToyDB.getInstance(this)
        val r_db = Runnable{
            addToDB(
                    4,
                    "car4",
                    "brand4",
                    4000,
                    R.drawable.baby_4,
                    listOf(3.0, 4.5, 3.4, 3.0, 5.0),
                    listOf(3.2, 3.5, 2.4, 4.0, 4.0)
            )
            toyList = toyDB?.toyDao()?.getAll()!!

/*
            this@MainActivity.runOnUiThread {
                recyclerview_container.layoutManager = LinearLayoutManager(applicationContext)
                var toyAdapter = ToyAdapter(toyList, this)
                recyclerview_container.adapter = toyAdapter
            }
*/


        }
        val thread = Thread(r_db)
        thread.start()
        //Recyclerview Setting

    }

    //setting menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //icon click activate
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(false)
        //change the design of back button to logo
        supportActionBar?.setHomeAsUpIndicator(R.mipmap.app_icon)
        supportActionBar?.title = null

        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }



    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {

            android.R.id.home -> {
                viewPager?.currentItem = 0
                true
            }
            else -> {

                return super.onOptionsItemSelected(item)
            }

        }

    }


    fun addToDB(id : Int,
                name : String,
                brand : String,
                cost : Int,
                imageSource : Int,
                themomPoints : List<Double>,
                userPoints: List<Double>){
        var newToy = Toy(
            id,
            name,
            brand,
            cost,
            imageSource,
            themomPoints,
            userPoints
        )
        toyDB?.toyDao()?.insert(newToy)
    }


}
