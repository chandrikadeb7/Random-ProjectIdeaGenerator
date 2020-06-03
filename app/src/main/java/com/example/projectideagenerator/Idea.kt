package com.example.projectideagenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import java.util.Arrays.asList
import kotlin.collections.RandomAccess
import java.util.Arrays.asList





class Idea : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idea)

        val ideaButton: Button = findViewById(R.id.idea_button)
        ideaButton.setOnClickListener { generateIdea() }
    }

    val ideas = arrayOf(
            "Tic-Tac-Toe",
            "Quiz App",
            "Meme Generator",
            "Random Number Generator",
            "Rolling Dice",
            "To-Do-List App",
            "Color Game",
            "Covid-Tracker",
            "Weather App",
            "Hangman Game App",
            "Photo Album App")


    private fun generateIdea() {
        val random = Random()
        val resultText: TextView = findViewById(R.id.result_text)
        val totallength = ideas.size
        val projectidea = random.nextInt(totallength)
        resultText.text = ideas[projectidea].toString()
        //Toast.makeText(this, "New Project Idea",
                //Toast.LENGTH_SHORT).show()
    }
}

