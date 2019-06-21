package com.ssong.themom


import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.ViewGroup

class ViewPageAdapter internal constructor (fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val COUNT = 5
    public var currentFragment : Fragment? = null

    override fun getItem(p0: Int): Fragment? {
        var fragment: Fragment? = null
        when (p0){
            0 -> fragment = HomeFragment()
            1 -> fragment = SearchFragment()
            2 -> fragment = PlusFragment()
            3 -> fragment = RankFragment()
            4 -> fragment = MypageFragment()

        }
        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title :String? = null
        when (position) {
            0 -> title = "홈"
            1 -> title = "검색"
            2 -> title = "플러스"
            3 -> title = "랭킹"
            4 -> title = "마이페이지"

        }

        return title
    }

    override fun setPrimaryItem(container: ViewGroup, position: Int, `object`: Any) {
        if (currentFragment != `object`) {
            currentFragment = `object` as Fragment
        }
        super.setPrimaryItem(container, position, `object`)
    }


}