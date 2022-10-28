package com.nachocampos.flagged

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        val btnPlay : Button = findViewById(R.id.btn_play)
        val etName : EditText = findViewById(R.id.et_name)

        /**
         * Conditional statement that throws an info toast any time the user clicks the btnPlay
         * without filling in the etName with his or her user name. If it's not empty, we create
         * an instance of the class Intent to state from which activity to which one we are going to
         * navigate and which data we need to transfer to the QuestionsActivity.
         */
        btnPlay.setOnClickListener {
            if (etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your user name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}