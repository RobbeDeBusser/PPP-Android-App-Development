package com.rdb.firstkotlinprogram

fun main(args: Array<String>) {

    //Immutable
    println("------------Immutable------------")
    var age = mapOf<String, Int>("David" to 20, "Josh" to 30)

    println("David age is = " + age["David"])
    println("Josh age is = " + age["Josh"])

    //Mutable
    println("------------Mutable------------")
    var mutableAge = mutableMapOf<String, Int>("David" to 20, "Josh" to 30)

    mutableAge.put("buffon", 30)

    println("David age is = " + mutableAge["David"])
    println("Josh age is = " + mutableAge["Josh"])
    println("buffon age is = " + mutableAge.get("buffon"))

}