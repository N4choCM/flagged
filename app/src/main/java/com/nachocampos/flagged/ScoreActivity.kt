package com.nachocampos.flagged

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val tvUser : TextView = findViewById(R.id.tv_userName)
        val tvFinalScore : TextView = findViewById(R.id.tv_finalScore)
        val btnEnd : Button = findViewById(R.id.btn_end)

        val finalText = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvFinalScore.text = "Your score is $correctAnswers out of $totalQuestions."
        tvUser.text = "Congratulations, $finalText!"


        btnEnd.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}