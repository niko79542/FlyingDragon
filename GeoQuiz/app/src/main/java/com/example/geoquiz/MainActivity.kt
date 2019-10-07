package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

const val QUESTION_INDEX = "QUESTION_INDEX"
const val NUM_CORRECT = "NUM_CORRECT"

class MainActivity : AppCompatActivity() {

    data class Question(
        val text: Int,
        val answer: Boolean)

    // The first answer is the correct one.  We randomize the answers before showing the text.
    // All questions must have four answers.  We'd want these to contain references to string
    // resources so we could internationalize. (Or better yet, don't define the questions in code...)
    private val questions: MutableList<Question> = mutableListOf(
        Question(text = R.string.questionOne, answer = true),
        Question(text = R.string.question_asia, answer = true),
        Question(text = R.string.question_americas, answer = true),
        Question(text = R.string.question_africa, answer = true),
        Question(text = R.string.question_mideast, answer = false),
        Question(text = R.string.question_oceans, answer = true)
    )
    lateinit var questionText : TextView
    lateinit var myToast : Toast
    lateinit var currentQuestion : Question
    lateinit var scoreBoard : TextView
    private var currentAnswer : Int = 0
    private var questionIndex : Int = 0
    private var numCorrect : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionText = findViewById(R.id.firstQuestion)
        scoreBoard = findViewById(R.id.seeScore)

        if (savedInstanceState != null) {
            questionIndex = savedInstanceState.getInt(QUESTION_INDEX)
            numCorrect = savedInstanceState.getInt(NUM_CORRECT)
        }


        setQuestion()
        setListeners()
    }

    private fun setQuestion() {
        currentQuestion = questions[questionIndex]
        currentAnswer = when (currentQuestion.answer) {
            true -> R.id.trueButton
            else -> R.id.falseButton
        }
        questionText.setText(currentQuestion.text)


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(QUESTION_INDEX, questionIndex)
        outState.putInt(NUM_CORRECT, numCorrect)
    }

    private fun answeredCorrectly(view: View):Boolean {
        return view.id == currentAnswer
    }

    private fun checkAnswer(view: View) {
        // if (view.
        // answeredCorrectly = true
        val toastMessage: String
        if (answeredCorrectly(view)) {
            toastMessage = "You are correct!"
            numCorrect++
        } else {
            toastMessage = "Incorrect!"
        }

        val myToast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT)
        myToast.show()
    }

    private fun setNextQuestion() {
        questionIndex = (questionIndex + 1) % questions.size
        setScore()
        setQuestion()
    }

    private fun setScore() {
        scoreBoard.setText(getString(R.string.scorePore, numCorrect, questions.size))
    }

    private fun setListeners() {
        findViewById<Button>(R.id.trueButton).setOnClickListener { view: View ->
            checkAnswer(view)
        }
        findViewById<Button>(R.id.falseButton).setOnClickListener { view: View ->
            checkAnswer(view)
        }

        findViewById<Button>(R.id.buttonNext).setOnClickListener { view: View ->
            setNextQuestion()
        }
    }
}
