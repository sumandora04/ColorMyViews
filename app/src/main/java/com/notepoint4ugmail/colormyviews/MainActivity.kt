package com.notepoint4ugmail.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.notepoint4ugmail.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setListener();
    }

    private fun makeColor(view: View) {
        when (view) {
            binding.box1Text -> view.setBackgroundColor(Color.DKGRAY)
            binding.box2Text -> view.setBackgroundColor(Color.GREEN)
            binding.box3Text -> view.setBackgroundColor(Color.CYAN)
            binding.box4Text -> view.setBackgroundColor(Color.MAGENTA)
            binding.box5Text -> view.setBackgroundColor(Color.YELLOW)
            binding.buttonGreen -> view.setBackgroundResource(R.color.my_green)
            binding.buttonRed -> view.setBackgroundResource(R.color.my_red)
            binding.buttonYellow -> view.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListener() {

        val clickableViews: List<View> = listOf(
            binding.box1Text,
            binding.box2Text, binding.box3Text, binding.box4Text,
            binding.box5Text, binding.constraintRoot, binding.buttonGreen,
            binding.buttonRed, binding.buttonYellow
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColor(it) }
        }
    }
}
