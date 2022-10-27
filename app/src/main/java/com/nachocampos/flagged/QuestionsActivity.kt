package com.nachocampos.flagged

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var currentPosition : Int = 1
    private var questionsList : ArrayList<Question>? = null
    private var selectedOptionPosition : Int = 0

    private var userName : String? = null
    private var correctAnswers : Int = 0

    private var progressBar : ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivPicture : ImageView? = null

    private var tvOptionA : TextView? = null
    private var tvOptionB : TextView? = null
    private var tvOptionC : TextView? = null
    private var tvOptionD : TextView? = null
    private var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        userName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivPicture = findViewById(R.id.iv_picture)
        tvOptionA = findViewById(R.id.tv_option_a)
        tvOptionB = findViewById(R.id.tv_option_b)
        tvOptionC = findViewById(R.id.tv_option_c)
        tvOptionD = findViewById(R.id.tv_option_d)
        btnSubmit = findViewById(R.id.btn_submit)

        tvOptionA?.setOnClickListener(this)
        tvOptionB?.setOnClickListener(this)
        tvOptionC?.setOnClickListener(this)
        tvOptionD?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        questionsList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {

        defaultOptionsView()
        val question: Question = questionsList!![currentPosition - 1]
        ivPicture?.setImageResource(question.picture)
        progressBar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionA?.text = question.optA
        tvOptionB?.text = question.optB
        tvOptionC?.text = question.optC
        tvOptionD?.text = question.optD

        if(currentPosition == questionsList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvOptionA?.let{
            options.add(0, it)
        }
        tvOptionB?.let{
            options.add(1, it)
        }
        tvOptionC?.let{
            options.add(2, it)
        }
        tvOptionD?.let{
            options.add(3, it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }

    }

    private fun selectedOptionView(tv : TextView, selectedOptNum : Int){
        defaultOptionsView()

        selectedOptionPosition = selectedOptNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view: View?) {

        when(view?.id){
            R.id.tv_option_a -> {
                tvOptionA?.let{
                    selectedOptionView(it, 1)
                }
            }
            R.id.tv_option_b -> {
                tvOptionB?.let{
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_option_c -> {
                tvOptionC?.let{
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_option_d -> {
                tvOptionD?.let{
                    selectedOptionView(it, 4)
                }
            }

            R.id.btn_submit -> {
                if(selectedOptionPosition == 0){
                    currentPosition++

                    when{
                        currentPosition <= questionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ScoreActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, userName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, questionsList?.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = questionsList?.get(currentPosition - 1)
                    if(question!!.correctOpt != selectedOptionPosition){
                        answerView(selectedOptionPosition, R.drawable.incorrect_option_border_bg)
                    }else{
                        correctAnswers++
                    }
                    answerView(question.correctOpt, R.drawable.correct_option_border_bg)

                    if(currentPosition == questionsList!!.size){
                        btnSubmit?.text = "FINISH"
                    }else{
                        btnSubmit?.text = "GO TO NEXT QUESTION"
                    }

                    selectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView : Int){
        when(answer){
            1 -> {
                tvOptionA?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                tvOptionB?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                tvOptionC?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                tvOptionD?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }

}