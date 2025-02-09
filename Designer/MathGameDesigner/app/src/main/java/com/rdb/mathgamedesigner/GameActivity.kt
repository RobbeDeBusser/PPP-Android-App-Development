package com.rdb.mathgamedesigner

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rdb.mathgamedesigner.databinding.ActivityGameBinding
import kotlin.random.Random
class GameActivity: AppCompatActivity() {

    lateinit var binding : ActivityGameBinding
    var correctAnswer = 0

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonOk.setOnClickListener {
            val input = binding.editTextAnswer.text.toString()
            if(input == ""){
                Toast.makeText(applicationContext, "Please write an answer or click the next button", Toast.LENGTH_LONG).show()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun gameContinue(){
        val number1 =  Random.nextInt(0,100)
        val number2 = Random.nextInt(0,100)

        binding.textViewQuestion.text = "$number1 + $number2"
        correctAnswer = number1+number2
    }


}