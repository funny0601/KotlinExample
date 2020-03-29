package com.kotlinexample

fun main(){
    // 1. 배열
    // 2. loop 반복
    // 3. 캐스팅 (가볍게)

    // 1. 배열 = {"", "", ""}
    var arr1 = listOf("1", "2") // 수정 불가능
    var arr2 = mutableListOf("1", "2") // 수정 가능

    arr2.add("3")

    // 2. 반복문
    for(item in arr1) {
        println(item)
    }

    for((index, item) in arr1.withIndex()) {
        println("$index, $item")
    }

    // 3. casting object < String, int, long ... 모든 변수 객체를 담을 수 있는 최상위 객체 // Any - auto casting
    var hello: Any = "hello"
    if(hello is String){
        var str: String = hello // 자동으로 캐스팅 해줌
    }
}