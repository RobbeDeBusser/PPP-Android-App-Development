package com.rdb.objectorientedprogramming.override

fun main(args: Array<String>) {

    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(100)
    vehicle.stop()

    println("------------------------------")

    var car = Car()

    car.superStart()
    car.superAccelerate()
    car.superStop()

    println("------------------------------")

    car.start()
    car.accelerate(200)
    car.stop()

}