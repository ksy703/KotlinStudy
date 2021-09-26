package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    first()
    println(second(91))
    println(third(89))
    gugudan()
}

fun first(){
    val list1 = MutableList(10, {0})
    val list2 = MutableList(10, {true})

    for (i in 1..9){
        list1[i] = i
    }
    println(list1)
    list1.forEachIndexed{ index, value ->
        list2[index] = value%2==0
    }
    println(list2)
}

fun second(score:Int):String{
    when(score){
        in 90..100 ->{
            return "A"
        }
        in 80..89->{
            return "B"
        }
        in 70..79->{
            return "C"
        }
        else->{
            return "F"
        }
    }
}

fun third(number:Int):Int{
    val a:Int=number/10
    val b:Int=number%10

    return a + b
}

fun gugudan(){
    for(x in 1..9){
        for(y in 1..9){
            println("$x x $y = ${x*y}")
        }
    }
}