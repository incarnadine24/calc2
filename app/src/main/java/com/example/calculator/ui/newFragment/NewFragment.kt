package com.example.calculator.ui.newFragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.calculator.R
import com.example.calculator.ui.secondFragment.SecondFragment
import kotlinx.android.synthetic.main.fragment_new.*


class NewFragment : Fragment(R.layout.fragment_new) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            num.setText((num1.text.toString().toInt() + num2.text.toString().toInt()).toString())
        }
        val btn2 = view.findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            num.setText((num1.text.toString().toInt() - num2.text.toString().toInt()).toString())
        }
        val btn3 = view.findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            num.setText((num1.text.toString().toInt() * num2.text.toString().toInt()).toString())
        }
        val btn4 = view.findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            num.setText((num1.text.toString().toInt() / num2.text.toString().toInt()).toString())
        }
        findNavController().navigate(R.id.action_nav_new_to_secondFragment,SecondFragment.NewInstance(num = num.toString().toInt()))

    }



}
