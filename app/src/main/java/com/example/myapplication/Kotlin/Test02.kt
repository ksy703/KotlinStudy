package com.example.myapplication.Kotlin
//1) 사칙 연산을 수행할 수 있는 클래스


fun main(array: Array<String>){
    val calculator1 = Calculator1()
    println(calculator1.plus(4,5))
    println(calculator1.minus(4,5))
    println(calculator1.multiply(4,5))
    println(calculator1.divide(4,5))

}

class Calculator1(){
    fun plus(a:Int,b:Int):Int{
        return a+b
    }
    fun minus(a:Int,b:Int):Int{
        //먼저 들어온 수에서 뒤에 들어온 수를 뺀
        return a-b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
    fun divide(a:Int,b:Int):Int{
        return a/b
    }

}