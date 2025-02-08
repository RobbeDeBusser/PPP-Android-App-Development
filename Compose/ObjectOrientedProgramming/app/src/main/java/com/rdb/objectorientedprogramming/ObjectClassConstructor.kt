package com.rdb.objectorientedprogramming

fun main(args: Array<String>) {

/*
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Lamborghini"
    myCar2.model = 2022

    println("My car is a ${myCar.name} and it is a ${myCar.model}")
    println("My car is a ${myCar2.name} and it is a ${myCar2.model}")
*/

    var myCar = Cars(2021, "Ferrari")

    println("My car is a ${myCar.name} and it is a ${myCar.model}")

    myCar.name = "Lamborghini"
    myCar.model = 2022

    println("My car is a ${myCar.name} and it is a ${myCar.model}")

}