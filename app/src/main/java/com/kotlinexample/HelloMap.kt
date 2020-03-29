package com.kotlinexample

fun main(){
    //map - key, value pair
    //{"name":"SY"}

    var map1 = mapOf(Pair("name", "SY")) // 수정 불가
    var map2 = mutableMapOf<String, String>() //type
    map2.put("name", "SY")
    map2.put("age", "1")

    println(map2.keys) // key들만 모두 출력

    for(map in map1){
        println(map)
        println(map.key) // key만 출력
        print(map.value) // value만 출력
    }

}