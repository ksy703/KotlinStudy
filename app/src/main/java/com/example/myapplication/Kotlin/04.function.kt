package com.example.myapplication.Kotlin

//04.Function

// 함수 선언 방법
// fun 함수 (변수명:타입,변수명:타...);반환형{
//          함수내용
//          return 반환값
//}

fun plus(first: Int,second: Int): Int{
    val result: Int = first+second
    return result
}

fun main(array:Array<String>){
    // 함수를 호출 하는 방법
    val result = plus(5,10)
    println(result)

    //인수를 명시적으로 전달하는 방법
    val result2=plus(first=20,second=30)
    println(result2)
}