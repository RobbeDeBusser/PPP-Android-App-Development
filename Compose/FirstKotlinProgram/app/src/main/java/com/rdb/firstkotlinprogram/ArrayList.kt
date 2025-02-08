package com.rdb.firstkotlinprogram

fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(10)
    age.add(1, 20)
    age.add(30)

/*    println("First element of array = " + age[0])
    println("Second element of array = " + age.get(1))
    println("Third element of array =  ${age[2]}")

    age.remove(20)
    println(age.size)
    println("First element of array = " + age[0])
    println("Second element of array = " + age.get(1))*/

/*    var cars = arrayListOf<String>("Merceds", "BMW")

    cars.add("Audi")
    println("First element of array = " + cars[0])
    println("Second element of array = " + cars.get(1))
    println("Third element of array =  ${cars[2]}")*/

    var myMixedArrayList = arrayListOf<Any>()
    myMixedArrayList.add("Ford")
    myMixedArrayList.add(10)
    myMixedArrayList.add(true)
    myMixedArrayList.add(2.5)
    myMixedArrayList.add("K")

    println(myMixedArrayList[0])
    println(myMixedArrayList[1])
    println(myMixedArrayList[2])
    println(myMixedArrayList[3])
    println(myMixedArrayList[4])
}