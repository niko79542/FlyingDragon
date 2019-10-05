package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myToast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setListeners()
    }

    private fun checkAnswer(view: View) {
        val toastMessage = when (view.id) {
            R.id.button -> "You are correct!"
            else -> "Incorrect!"
        }
        myToast.cancel()
        val myToast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT)
        myToast.show()



    }

    private fun setListeners() {
        findViewById<Button>(R.id.button).setOnClickListener { view: View ->
            checkAnswer(view)
        }
        findViewById<Button>(R.id.button2).setOnClickListener { view: View ->
            checkAnswer(view)
        }
    }
}
