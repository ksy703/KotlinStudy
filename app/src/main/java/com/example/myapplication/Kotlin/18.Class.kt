package com.example.myapplication.Kotlin

// 18.Class

// OOP -> Object Oriented Programming (객체지향 프로그래밍)

// 객체란?
// - 이름이 있는 모든 것

// 객체를 만드는 방법
// - 설명서가 있어야 한다

fun main(array:Array<String>){

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car(engine="v8 engine", body="big")

    val bigCar = Car(engine="v8 engine", body="big")

    val superCar : SuperCar=SuperCar(engine="good engine",body="big",door="white")

    val runableCar:RunableCar = RunableCar(engine="simple engine",body = "small body")
    runableCar.drive()
    runableCar.navi("부산")

    val runableCar2:RunableCar2=RunableCar2("nice engine","long body")
    println(runableCar2.body)
    println(runableCar2.engine)

    val testClass=TestClass()
    testClass.test(1)
    testClass.test(1,2)
}

// 클래서(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String){

}

//클래스(설명서) 만드는 방법(2)
class SuperCar{
    var engine : String
    var body : String
    var door : String

    constructor(engine : String, body : String, door : String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(3) -> (1)의 확장
// engine,body만 반드시 필요한 경
class Car1 constructor(engine:String,body:String){
    var door : String = ""

    //constructor란? 생성
    constructor(engine:String,body:String,door:String):this(engine,body){
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> (2)의 확장
class Car2{
    var engine: String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine : String, body : String){
        this.engine = engine
        this.body=body
    }
    constructor(engine:String, body:String, door:String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine:String, body:String){
    //차의 기능
    fun ride(){
        println("탑승")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination:String){
        println("$destination 으로 목적지를 설정했습니다.")
    }
}

class RunableCar2{
    var engine:String
    var body:String

    constructor(engine:String,body:String){
        this.engine = engine
        this.body = body
    }

    init{ //객체가 만들어지고 가장 먼저 실행되는 함수
        println("RunableCar2가 만들어졌습니다.")
    }

    fun ride(){
        println("탑승")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination:String){
        println("$destination 으로 목적지를 설정했습니다.")
    }
}


//오버로딩(함수 이름이 같고 받는 파라미터가 다름)
class TestClass(){
    fun test(a:Int){
        println("up")
    }
    fun test(a:Int,b:Int){ //위의 test함수를 오버로딩했다
        println("down")
    }
}