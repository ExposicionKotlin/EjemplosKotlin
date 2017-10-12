package com.example.johnathan.examplekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var num1: Int =0
    private var num2: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSuma.setOnClickListener({

            num1 = Integer.parseInt(edNum1.text.toString())
            num2 = Integer.parseInt(edNum2.text.toString())


            txtResult.text="$num1 + $num2 = ${num1+num2}"
        })

        btnResta.setOnClickListener({
            view -> resta()
        })

        btnMult.setOnClickListener({
            view -> mult()
        })

        btnDiv.setOnClickListener({
            view -> div()
        })



    }

    fun resta(){
        num1 = Integer.parseInt(edNum1.text.toString())
        num2 = Integer.parseInt(edNum2.text.toString())


        txtResult.text="$num1 - $num2 = ${num1-num2}"
    }

    fun mult(){
        num1 = Integer.parseInt(edNum1.text.toString())
        num2 = Integer.parseInt(edNum2.text.toString())


        txtResult.text="$num1 * $num2 = ${num1*num2}"
    }

    fun div(){
        num1 = Integer.parseInt(edNum1.text.toString())
        num2 = Integer.parseInt(edNum2.text.toString())


        txtResult.text="$num1 / $num2 = ${num1/num2}"
    }


}
