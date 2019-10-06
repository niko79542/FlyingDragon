package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class TrueFalse {

}

class MainActivity : AppCompatActivity() {

    data class Question(
        val text: Int,
        val answer: Boolean)

    // The first answer is the correct one.  We randomize the answers before showing the text.
    // All questions must have four answers.  We'd want these to contain references to string
    // resources so we could internationalize. (Or better yet, don't define the questions in code...)
    private val questions: MutableList<Question> = mutableListOf(
        Question(text = R.string.question_africa, answer = true),
        Question(text = R.string.question_asia, answer = true),
        Question(text = R.string.question_americas, answer = true),
        Question(text = R.string.question_africa, answer = true),
        Question(text = R.string.questionOne, answer = false)

    )
    lateinit var questionText : TextView
    lateinit var myToast : Toast
    lateinit var currentQuestion: Question
    private var currentAnswer : Int = 0
    private var questionIndex : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionText = findViewById(R.id.firstQuestion)

        setNextQuetsion()
        setListeners()
    }

    private fun setNextQuetsion() {
        currentQuestion = questions[questionIndex]
        currentAnswer = when (currentQuestion.answer) {
            true -> R.id.trueButton
            else -> R.id.falseButton
        }
        questionText.setText(currentQuestion.text)
        questionIndex++
    }

    private fun checkAnswer(view: View) {
        // if (view.
        // answeredCorrectly = true

        val toastMessage = when (view.id) {
            currentAnswer -> "You are correct!"
            else -> "Incorrect!"
        }
        val myToast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT)
        myToast.show()



    }

    private fun setListeners() {
        findViewById<Button>(R.id.trueButton).setOnClickListener { view: View ->
            checkAnswer(view)
        }
        findViewById<Button>(R.id.falseButton).setOnClickListener { view: View ->
            checkAnswer(view)
        }

        findViewById<Button>(R.id.buttonNext).setOnClickListener { view: View ->
            setNextQuetsion()
        }
    }
}
