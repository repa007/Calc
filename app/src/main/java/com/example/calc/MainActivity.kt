package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt
import kotlin.math.sqrt

var a=0 //первое число
var b=0 //второе число
var A="" //первое число строковое
var B="" //второе число строковое
var action=0 //сюда вписывается тип операции
var result=0.0
var text: TextView?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //кнопка 1
    fun BOne(view: View) {
        if (action>0) {
            B=B+"1"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"1"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }
    //кнопка 2
    fun BTwo(view: View) {
        if (action>0) {
            B=B+"2"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"2"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 3
    fun BThree(view: View) {
        if (action>0) {
            B=B+"3"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A = A + "3"
            text = findViewById(R.id.textView)
            text?.setText(A.toString()) }
    }

    //кнопка 4
    fun BFour(view: View) {
        if (action>0) {
            B=B+"4"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"4"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 5
    fun BFive(view: View) {
        if (action>0) {
            B=B+"5"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"5"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 6
    fun BSix(view: View) {
        if (action>0){
            B=B+"6"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"6"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 7
    fun BSeven(view: View) {
        if (action>0) {
            B=B+"7"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"7"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 8
    fun BEight(view: View) {
        if (action>0) {
            B=B+"8"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"8"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 9
    fun BNine(view: View) {
        if (action>0) {
            B=B+"9"
            text=findViewById(R.id.textView)
            text?.setText(B.toString())}
        else{
            A=A+"9"
            text=findViewById(R.id.textView)
            text?.setText(A.toString())}
    }

    //кнопка 0
    fun BZero(view: View) {
        if ((A=="")or((B=="")and(action>0))){
            text = findViewById(R.id.textView)
            text?.setText("incorrect")
        }
        else {
            if (action > 0) {
                B = B + "0"
                text = findViewById(R.id.textView)
                text?.setText(B.toString())
            }
            else {
                A = A + "0"
                text = findViewById(R.id.textView)
                text?.setText(A.toString())
            }
        }
    }

    //кнопка вычетания
    fun BMinus(view: View) {
        action=1
    }

    //кнопка сложения
    fun BPlus(view: View) {
        action=2
    }

    //кнопка деления
    fun BDivision(view: View) {
        action=3
    }

    //кнопка умножения
    fun BMultiply(view: View) {
        action=4
    }
    //кнопка корня
    fun BSQ(view: View) {
        action=5
        //в обход равно
        if (B==""){
            a=A.toInt()
            result = sqrt(a.toDouble())
            text = findViewById(R.id.textView)
            text?.setText(result.toString())
        }
        else{
            text=findViewById(R.id.textView)
            text?.setText("incorrect")
        }
    }


    //удаление
    fun BDel(view: View) {
        a=0
        b=0
        action=0
        A=""
        B=""
        text=findViewById(R.id.textView)
        text?.setText(null)
    }

    //Равно!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    fun Bequality(view: View) {
        if ((action==0)or(B=="")or(A=="")){
            a=0
            b=0
            A=""
            B=""
            text=findViewById(R.id.textView)
            text?.setText("incorrect")}
        else{
            a = A.toInt()
            b = B.toInt()
            if (action == 1)
                result = a - b.toDouble()
            if (action == 2)
                result = a + b.toDouble()
            if (action == 3){
                var aa=a.toDouble()
                var bb=b.toDouble()
                result = aa / bb
            }
            if (action == 4)
                result = a * b.toDouble()
            text = findViewById(R.id.textView)
            text?.setText(result.toString())
            A = result.toInt().toString()
            B = ""
            a = 0
            b = 0
        }
    }



}