package com.example.mygitappexample.data

data class Question(
    val text: String,
    val answers: List<String>
) {

    fun showText() {
        println("$text")
    }

}