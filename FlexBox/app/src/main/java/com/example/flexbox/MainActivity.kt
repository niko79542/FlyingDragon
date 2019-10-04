package com.example.flexbox

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.flexbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var boxOneText : TextView
    lateinit var boxFiveText : TextView
    lateinit var boxTwoText : TextView
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Nicholas", nickname = "Niko")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        boxOneText = binding.boxOneText
        boxTwoText = binding.boxTwoText
        boxFiveText = binding.boxFiveText


        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> boxOneText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxTwoText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {


        val boxThreeText = binding.boxThreeText
        val boxFourText = binding.boxFourText

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                yellowButton, redButton, greenButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
