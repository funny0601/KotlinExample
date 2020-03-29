package com.kotlinexample

fun main(){

    // 유사 기능들(함수)의 집합체(객체)

    // 1. class
    // 2. data class - set, get

    var cls = HelloClass()
    var cls2 = HelloClass(10)

    println(cls2.age)

    var person = Person(5, "SY")

    println(person.age)
    println(person.name)
}

class HelloClass {
    var age: Int = 0
    init { // 값을 넘길 수가 없는 초기화

    }

    constructor() // 값을 넘기지는 못하지만 초기화 가능, 기본 생성자
    constructor(age: Int) {
        this.age = age
    } // 값을 넘기면서 초기화 가능, 보조 생성자

}

data class Person(var age: Int, val name: String)