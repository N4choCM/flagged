package com.nachocampos.flagged

data class Question(
    val id: Int,
    val question: String,
    val picture: Int,
    val optA: String,
    val optB: String,
    val optC: String,
    val optD: String,
    val correctOpt: Int
    )
