package com.rdb.firstkotlinprogram

fun main(args: Array<String>) {

    print("What is your name?")

    var name:String? = readln()

    print("How old are you?")

    var age:Int = readln()!!.toInt()

    println("Hello $name, you are $age years old")

}