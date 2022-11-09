package com.example.mygitappexample.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mygitappexample.R

/**
 * AboutFragment
 *
 * @author (c) 2022, UVI TECH SAPI De CV, KAVAK
 */
class AboutFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

}