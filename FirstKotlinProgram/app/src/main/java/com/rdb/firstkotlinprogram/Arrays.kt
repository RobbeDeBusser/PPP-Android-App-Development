package com.rdb.firstkotlinprogram

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)
    println("First element of array = " + age[0])
    println("Second element of array = " + age[1])
    println("Third element of array = " + age[2])

    println("------------------------------------------------------------")

    var cars = arrayOf("Merceds", "BMW", "Audi")
    println("First element of array = " + cars[0])
    println("Second element of array = " + cars[1])
    println("Third element of array = " + cars[2])

    println("------------------------------------------------------------")

    cars.set(2, "Ford")
    println("First element of array = " + cars[0])
    println("Second element of array = " + cars[1])
    println("Third element of array = " + cars[2])

    println("Size of cars array = " + cars.size)

    println("------------------------------------------------------------")

    var carsAndAge = arrayOf("Merceds", 5, "BMW", 10)

    println("First element of array = " + carsAndAge[0])
    println("Second element of array = " + carsAndAge.get(1))
    println("Third element of array = " + carsAndAge[2])
    println("Third element of array = " + carsAndAge[3])

}