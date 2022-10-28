package com.nachocampos.flagged


object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.cameroon,
            "Cameroon",
            "Brazil",
            "Congo",
            "Australia",
            1
        )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.canada,
            "Austria",
            "Canada",
            "Peru",
            "Iran",
            2
        )
        questionsList.add(q2)

        val q3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.china,
            "China",
            "Japan",
            "Korea",
            "North Korea",
            1
        )
        questionsList.add(q3)

        val q4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.colombia,
            "Venezuela",
            "Brazil",
            "Colombia",
            "Cameroon",
            3
        )
        questionsList.add(q4)

        val q5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.cuba,
            "Puerto Rico",
            "Cuba",
            "USA",
            "Austria",
            2
        )
        questionsList.add(q5)

        val q6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.el_salvador,
            "Argentina",
            "Uruguay",
            "France",
            "El Salvador",
            4
        )
        questionsList.add(q6)

        val q7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.finland,
            "Iceland",
            "Finland",
            "Norway",
            "Sweden",
            2
        )
        questionsList.add(q7)

        val q8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.austria,
            "Austria",
            "Peru",
            "Canada",
            "Denmark",
            1
        )
        questionsList.add(q8)

        val q9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.iceland,
            "Finland",
            "Denmark",
            "Sweden",
            "Iceland",
            4
        )
        questionsList.add(q9)

        val q10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.iran,
            "UAE",
            "Hungary",
            "Iran",
            "Australia",
            3
        )
        questionsList.add(q10)

        val q11 = Question(
            11,
            "What country does this flag belong to?",
            R.drawable.kenya,
            "El Salvador",
            "Brazil",
            "Congo",
            "Kenya",
            4
        )
        questionsList.add(q11)

        val q12 = Question(
            12,
            "What country does this flag belong to?",
            R.drawable.korea,
            "Korea",
            "North Korea",
            "Thailand",
            "New Zealand",
            1
        )
        questionsList.add(q12)

        val q13 = Question(
            13,
            "What country does this flag belong to?",
            R.drawable.norway,
            "Norway",
            "Finland",
            "Denmark",
            "Iceland",
            1
        )
        questionsList.add(q13)

        val q14 = Question(
            14,
            "What country does this flag belong to?",
            R.drawable.peru,
            "Denmark",
            "Austria",
            "North Korea",
            "Peru",
            4
        )
        questionsList.add(q14)

        val q15 = Question(
            15,
            "What country does this flag belong to?",
            R.drawable.puerto_rico,
            "Cuba",
            "USA",
            "Puerto Rico",
            "Chile",
            3
        )
        questionsList.add(q15)

        val q16 = Question(
            16,
            "What country does this flag belong to?",
            R.drawable.south_africa,
            "Kenya",
            "South Africa",
            "Congo",
            "Cape Town",
            2
        )
        questionsList.add(q16)

        val q17 = Question(
            17,
            "What country does this flag belong to?",
            R.drawable.sweden,
            "Norway",
            "Finland",
            "Sweden",
            "Iceland",
            3
        )
        questionsList.add(q17)

        val q18 = Question(
            18,
            "What country does this flag belong to?",
            R.drawable.thailand,
            "Thailand",
            "North Korea",
            "Liechtenstein",
            "India",
            1
        )
        questionsList.add(q18)

        val q19 = Question(
            19,
            "What country does this flag belong to?",
            R.drawable.venezuela,
            "Cameroon",
            "Colombia",
            "Venezuela",
            "Peru",
            3
        )
        questionsList.add(q19)

        val q20 = Question(
            20,
            "What country does this flag belong to?",
            R.drawable.wales,
            "England",
            "Scotland",
            "Wales",
            "North Ireland",
            3
        )
        questionsList.add(q20)

        val q21 = Question(
            21,
            "What country does this flag belong to?",
            R.drawable.andorra,
            "Andorra",
            "Liechtenstein",
            "Malta",
            "Czech Republic",
            1
        )
        questionsList.add(q21)

        val q22 = Question(
            22,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Uruguay",
            "Argentina",
            "El Salvador",
            "USA",
            2
        )
        questionsList.add(q22)

        val q23 = Question(
            23,
            "What country does this flag belong to?",
            R.drawable.australia,
            "New Zealand",
            "UK",
            "Australia",
            "Austria",
            3
        )
        questionsList.add(q23)

        val q24 = Question(
            24,
            "What country does this flag belong to?",
            R.drawable.belgium,
            "Germany",
            "Mexico",
            "Nederland",
            "Belgium",
            4
        )
        questionsList.add(q24)

        val q25 = Question(
            25,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Cameroon",
            "Brazil",
            "Congo",
            "Malta",
            2
        )
        questionsList.add(q25)

        val q26 = Question(
            26,
            "What country does this flag belong to?",
            R.drawable.denmark,
            "Denmark",
            "Austria",
            "Peru",
            "Thailand",
            1
        )
        questionsList.add(q26)

        val q27 = Question(
            27,
            "What country does this flag belong to?",
            R.drawable.spain,
            "Portugal",
            "China",
            "Spain",
            "Austria",
            3
        )
        questionsList.add(q27)

        val q28 = Question(
            28,
            "What country does this flag belong to?",
            R.drawable.fiji,
            "Iceland",
            "Fiji",
            "Finland",
            "Nederland",
            2
        )
        questionsList.add(q28)

        val q29 = Question(
            29,
            "What country does this flag belong to?",
            R.drawable.france,
            "Cuba",
            "Nederland",
            "France",
            "Georgia",
            3
        )
        questionsList.add(q29)

        val q30 = Question(
            30,
            "What country does this flag belong to?",
            R.drawable.georgia,
            "England",
            "UK",
            "Georgia",
            "Australia",
            3
        )
        questionsList.add(q30)

        val q31 = Question(
            31,
            "What country does this flag belong to?",
            R.drawable.germany,
            "Belgium",
            "Kenya",
            "Congo",
            "Germany",
            4
        )
        questionsList.add(q31)

        val q32 = Question(
            32,
            "What country does this flag belong to?",
            R.drawable.haiti,
            "Thailand",
            "Malta",
            "Liechtenstein",
            "Haiti",
            4
        )
        questionsList.add(q32)

        val q33 = Question(
            33,
            "What country does this flag belong to?",
            R.drawable.hungary,
            "Italy",
            "Hungary",
            "Mexico",
            "Iran",
            2
        )
        questionsList.add(q33)

        val q34 = Question(
            34,
            "What country does this flag belong to?",
            R.drawable.india,
            "Mexico",
            "Hungary",
            "India",
            "Iran",
            3
        )
        questionsList.add(q34)

        val q35 = Question(
            35,
            "What country does this flag belong to?",
            R.drawable.italy,
            "Italy",
            "Mexico",
            "India",
            "Hungary",
            1
        )
        questionsList.add(q35)

        val q36 = Question(
            36,
            "What country does this flag belong to?",
            R.drawable.japan,
            "Japan",
            "Fiji",
            "Finland",
            "Haiti",
            1
        )
        questionsList.add(q36)

        val q37 = Question(
            37,
            "What country does this flag belong to?",
            R.drawable.kuwait,
            "South Africa",
            "Malaysia",
            "Kuwait",
            "Iran",
            3
        )
        questionsList.add(q37)

        val q38 = Question(
            38,
            "What country does this flag belong to?",
            R.drawable.liechtenstein,
            "Andorra",
            "Liechtenstein",
            "Malta",
            "Nederland",
            2
        )
        questionsList.add(q38)

        val q39 = Question(
            39,
            "What country does this flag belong to?",
            R.drawable.malta,
            "Austria",
            "Peru",
            "Malta",
            "Japan",
            3
        )
        questionsList.add(q39)

        val q40 = Question(
            40,
            "What country does this flag belong to?",
            R.drawable.mexico,
            "Mexico",
            "Italy",
            "Hungary",
            "Iran",
            1
        )
        questionsList.add(q40)

        val q41 = Question(
            41,
            "What country does this flag belong to?",
            R.drawable.nederland,
            "Nederland",
            "France",
            "Slovakia",
            "Slovenia",
            1
        )
        questionsList.add(q41)

        val q42 = Question(
            42,
            "What country does this flag belong to?",
            R.drawable.new_zealand,
            "UK",
            "Australia",
            "Thailand",
            "New Zealand",
            4
        )
        questionsList.add(q42)

        val q43 = Question(
            43,
            "What country does this flag belong to?",
            R.drawable.portugal,
            "Portugal",
            "Brazil",
            "Congo",
            "Kenya",
            1
        )
        questionsList.add(q43)

        val q44 = Question(
            44,
            "What country does this flag belong to?",
            R.drawable.russia,
            "Nederland",
            "Belgium",
            "Russia",
            "Slovenia",
            3
        )
        questionsList.add(q44)

        val q45 = Question(
            45,
            "What country does this flag belong to?",
            R.drawable.slovakia,
            "Russia",
            "Slovenia",
            "Slovakia",
            "Nederland",
            3
        )
        questionsList.add(q45)

        val q46 = Question(
            46,
            "What country does this flag belong to?",
            R.drawable.slovenia,
            "Nederland",
            "Slovakia",
            "Russia",
            "Slovenia",
            4
        )
        questionsList.add(q46)

        val q47 = Question(
            47,
            "What country does this flag belong to?",
            R.drawable.switzerland,
            "Denmark",
            "Switzerland",
            "Canada",
            "Norway",
            2
        )
        questionsList.add(q47)

        val q48 = Question(
            48,
            "What country does this flag belong to?",
            R.drawable.uk,
            "USA",
            "Australia",
            "England",
            "UK",
            4
        )
        questionsList.add(q48)

        val q49 = Question(
            49,
            "What country does this flag belong to?",
            R.drawable.usa,
            "Puerto Rico",
            "Cuba",
            "USA",
            "UK",
            3
        )
        questionsList.add(q49)

        val q50 = Question(
            50,
            "What country does this flag belong to?",
            R.drawable.north_korea,
            "Korea",
            "Thailand",
            "Liechtenstein",
            "North Korea",
            4
        )
        questionsList.add(q50)

        return questionsList
    }

}