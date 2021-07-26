package com.example.calculator.ui.secondFragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.R
import kotlinx.android.synthetic.main.fragment_new.*
import kotlinx.android.synthetic.main.fragment_second.*

const val NUMKEY = "num"
class SecondFragment : Fragment(R.layout.fragment_second) {

    var number : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            number = getInt(NUMKEY)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            edit1.setText((num.toString().toInt()).toString())
        }
        //edit1.setText(num.toString().toInt())
    }

    companion object{
        fun NewInstance(num : Int) : Bundle {
            return Bundle().apply {
                putInt(NUMKEY,num)
            }
        }
    }
}