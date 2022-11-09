package com.example.mygitappexample.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mygitappexample.R
import com.example.mygitappexample.data.QuestionStore

/**
 * GameFragment
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
class GameFragment: Fragment() {

    private lateinit var questionTile: TextView
    private lateinit var answer1: RadioButton
    private lateinit var answer2: RadioButton
    private lateinit var answer3: RadioButton
    private lateinit var answer4: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game,container,false)
        questionTile = view.findViewById(R.id.questionText)
        answer1 = view.findViewById(R.id.firstAnswerRadioButton)
        answer2 = view.findViewById(R.id.secondAnswerRadioButton)
        answer3 = view.findViewById(R.id.thirdAnswerRadioButton)
        answer4 = view.findViewById(R.id.fourthAnswerRadioButton)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val question = QuestionStore.questions.first()
        questionTile.text = question.text
        answer1.text = question.answers[0]
        answer2.text = question.answers[1]
        answer3.text = question.answers[2]
        answer4.text = question.answers[3]
    }
}