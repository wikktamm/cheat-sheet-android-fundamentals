package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testapp.others.ViewPager2Adapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_view_pager2.*

class ViewPagerAndTabLayout2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)
        val items = arrayOf(R.drawable.ic_baseline_filter_2_24, R.drawable.ic_1, R.drawable.ic_launcher_foreground)
        val adapter =
            ViewPager2Adapter(items.toList())
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = "Tab ${position+1}"
        }.attach()


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ViewPagerAndTabLayout2Activity, "Reselected pos ${tab?.position}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ViewPagerAndTabLayout2Activity, "Unselected pos ${tab?.position}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ViewPagerAndTabLayout2Activity, "Selected pos ${tab?.position}", Toast.LENGTH_SHORT).show()
            }
        })

    }
}