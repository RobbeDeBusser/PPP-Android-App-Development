package com.rdb.firstkotlinprogram

fun main(args: Array<String>) {

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z = x + y
    println("x + y = $z")

    z += x
    println("z += x = $z")

    z -= x
    println("z -= x = $z")

    z *= x
    println("z *= x = $z")

    z /= x
    println("z /= x = $z")

    z %= x
    println("z %= x = $z")

}