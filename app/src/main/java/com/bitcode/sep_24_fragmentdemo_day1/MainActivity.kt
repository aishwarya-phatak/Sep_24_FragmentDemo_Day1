package com.bitcode.sep_24_fragmentdemo_day1

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
    private lateinit var fragmentTransaction2: FragmentTransaction
    private var fragmentManager = supportFragmentManager
    private var counterFragments = ArrayList<CounterFragment>()

    private lateinit var activityMainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }
}