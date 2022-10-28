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

        /**
         * Here we fill the array list of questionsList with all the questions created in the class
         * Constants.
         */
        questionsList = Constants.getQuestions()
        setQuestion()
    }

    /**
     * Method which assignas the value of a question from the arrayList questionsList (which was
     * filled with the questions created in the class Constants) to the var question of type
     * Question and links the components of the question of the class Constant with the view of the
     * activity_questions.xml so that the user can see it.
     * Furthermore, the progress bar and the counter gets increased.
     * It also has a conditional statement which changes the text of the button to "FINISH" if we
     * are on the last question.
     * The defaultOptionsView() method is called at the beginning so that all the options are
     * colorless.
     */
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

    /**
     * Method which defines an array list with all the options of the current question and
     * establishes the font style and the borders style of these options.
     */
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

    /**
     * Method that changes the style of the selected option with a purple border and bold text.
     * The defaultOptionsView() method is called at the beginning so that all the options are
     * colorless.
     */
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

    /**
     * Method which decides when to call the selectedOptionView() and the answerView() methods.
     * The former method establishes a purple border and bold typography when selecting an option,
     * whereas the latter paints the tv in green or red depending on the result of the question.
     * It also gives functionality to the btn_submit button. This functionality consists of deciding
     * whether going to the final score activity with an intent or showing the next question.
     * Similarly, if we finished the quiz, the btn_submit displays the text "FINISH", but if we
     * haven't finished yet, the text displayed will be "GO TO NEXT QUESTION".
     * At the end of the method, the selectedOptionPosition is restarted to 0 in order to ensure
     * the correct function of the following question.
     */
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

    /**
     * Method which defines the behaviour of the (in)correct option (i.e., whether they are painted
     * in green or both in green and red).
     */
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