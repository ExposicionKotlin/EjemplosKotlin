package com.example.johnathan.examplekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    //declaro variables que podrían tomar valor null
    private var num1: Int? = null
    private var num2: Int? = null
    private var resultado: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //hacemos un listener Forma 1
        btnSuma.setOnClickListener({

            if(!edNum1.text.isEmpty() && !edNum2.text.isEmpty()){
                num1 = Integer.parseInt(edNum1.text.toString())
                num2 = Integer.parseInt(edNum2.text.toString())

                //como num1 y num2 pueden ser null
                //al hacer una operación con ellos es necesario declarar de nuevo
                //en la operación el tipo de dato con el que se trabaja
                //esa es la razón de los "as Int"
                resultado = ""+ "$num1 + $num2 = ${num1 as Int + num2 as Int}"
            }

            //como el String resultado lo delcaramos incialmente que podría ser null
            //para pdoder usarlo es necesario usar un if para indicar que pasa
            //en el caso que sea null o no
            if(resultado!=null){
                txtResult.setText(resultado)
            }else{
                Toast.makeText(this,"Al parecer no ha ingresado los dos números pertinentes",Toast.LENGTH_LONG).show()
            }
        })

        //listener Forma 2
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

        if( !edNum1.text.isEmpty() && !edNum2.text.isEmpty()){
            num1 = Integer.parseInt(edNum1.text.toString())
            num2 = Integer.parseInt(edNum2.text.toString())


            resultado = ""+ "$num1 - $num2 = ${num1 as Int - num2 as Int}"
        }

        //como el String resultado lo delcaramos incialmente que podría ser null
        //para pdoder usarlo es necesario usar un if para indicar que pasa
        //en el caso que sea null o no
        if(resultado!=null){
            txtResult.setText(resultado)
        }else{
            Toast.makeText(this,"Al parecer no ha ingresado los dos números pertinentes",Toast.LENGTH_LONG).show()
        }

    }

    fun mult(){
        if( !edNum1.text.isEmpty() && !edNum2.text.isEmpty()){
            num1 = Integer.parseInt(edNum1.text.toString())
            num2 = Integer.parseInt(edNum2.text.toString())


            resultado = ""+ "$num1 * $num2 = ${num1 as Int * num2 as Int}"
        }

        //como el String resultado lo delcaramos incialmente que podría ser null
        //para pdoder usarlo es necesario usar un if para indicar que pasa
        //en el caso que sea null o no
        if(resultado!=null){
            txtResult.setText(resultado)
        }else{
            Toast.makeText(this,"Al parecer no ha ingresado los dos números pertinentes",Toast.LENGTH_LONG).show()
        }
    }

    fun div(){
        if( !edNum1.text.isEmpty() && !edNum2.text.isEmpty()){
            num1 = Integer.parseInt(edNum1.text.toString())
            num2 = Integer.parseInt(edNum2.text.toString())


            resultado = ""+"$num1 / $num2 = ${(num1 as Int) / (num2 as Int)}"
        }

        //como el String resultado lo delcaramos incialmente que podría ser null
        //para pdoder usarlo es necesario usar un if para indicar que pasa
        //en el caso que sea null o no
        if(resultado!=null){
            txtResult.setText(resultado)
        }else{
            Toast.makeText(this,"Al parecer no ha ingresado los dos números pertinentes",Toast.LENGTH_LONG).show()
        }

    }


}




