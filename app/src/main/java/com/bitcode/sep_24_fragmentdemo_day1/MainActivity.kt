package com.bitcode.sep_24_fragmentdemo_day1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction
import com.bitcode.sep_24_fragmentdemo_day1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var counterFragment: CounterFragment
    private lateinit var fragmentTransaction1: FragmentTransaction
    private var fragmentManager = supportFragmentManager
    private var counterFragments = ArrayList<CounterFragment>()

    private lateinit var activityMainBinding : ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnAddFragment.setOnClickListener {
            counterFragment = CounterFragment()

            fragmentTransaction1 = fragmentManager.beginTransaction()
            fragmentTransaction1.add(R.id.counterFragment,counterFragment)
                .addToBackStack("Counter Fragment Added")
            fragmentTransaction1.commit()

            counterFragments.add(counterFragment)
        }

        activityMainBinding.btnRemoveFragment.setOnClickListener {

            var counterFragmentIndex = counterFragments.size - 1
            counterFragment = counterFragments[counterFragmentIndex]

            fragmentManager.beginTransaction()
                .remove(counterFragment)
                .commit()

            counterFragments.remove(counterFragment)
        }
    }
}