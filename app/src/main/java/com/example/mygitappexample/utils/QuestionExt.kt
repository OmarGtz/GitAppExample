package com.example.mygitappexample

import com.example.mygitappexample.data.Question

/**
 * QuestionExt
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
fun Question.showQuestions() {
    println(answers.joinToString { " " })
    showText()
}