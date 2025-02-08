package com.rdb.objectorientedprogramming

fun main(args: Array<String>) {

    //creating car object
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 350
    car.show()

    //creating motorcycle object
    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Yamaha"
    motorcycle.maxSpeed = 220
    motorcycle.show()

}