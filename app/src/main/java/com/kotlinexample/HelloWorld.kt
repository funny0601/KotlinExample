package com.kotlinexample

// 코틀린은 ;이 필요 없음

fun main(){
    val hello1 = "hello world1" //final
    var hello2: String = "world2" // 타입형 뒤에 ?을 넣으면 null을 넣을 수 있음, 없으면 넣을 수 없음
    var hello3: String? = "world3"

    print(hello1)
    println(hello1)

    println(hello())
}

fun hello(): String { // private String hello()
    return "hello fun!"
}


