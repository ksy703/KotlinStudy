package com.example.myapplication.Kotlin

var a = 1+2+3+4+5
var b = "1"
var c = b.toInt()
var d = c.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

//var abc : Int = null (오류 발생)
var abc1 : Int? = null
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)
}

