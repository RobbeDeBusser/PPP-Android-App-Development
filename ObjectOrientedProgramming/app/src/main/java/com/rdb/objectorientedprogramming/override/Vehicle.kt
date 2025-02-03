package com.rdb.objectorientedprogramming.override

open class Vehicle {

    open fun start()
    {
        println("Starting the vehicle")
    }

    open fun accelerate(speed:Int)
    {
        println("Accelerating the vehicle to $speed")
    }

    open fun stop()
    {
        println("Stopping the vehicle")
    }

}