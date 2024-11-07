package com.bitcode.sep_24_fragmentdemo_day1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private lateinit var txtCounter: TextView
    private lateinit var btnIncrement: Button
    private lateinit var btnDecrement: Button
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.counter_fragment, null)
        txtCounter = view.findViewById(R.id.txtCounter)
        btnIncrement = view.findViewById(R.id.btnIncrement)
        btnDecrement = view.findViewById(R.id.btnDecrement)
        return view
    }
}