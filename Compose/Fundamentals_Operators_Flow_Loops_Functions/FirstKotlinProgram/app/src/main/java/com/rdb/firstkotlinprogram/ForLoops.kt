package com.rdb.firstkotlinprogram
import kotlin.random.Random
fun main(args: Array<String>) {
    for (number in 1..10)
    {
        println(number)
    }
    var k = 1
    var fact = 1
    while (k < 6)
    {
        fact *= k
        println("$k! = $fact")
        k++
    }
    //infinite loop
    val number =  Random.nextInt(0, 10)
    println("PLease enter a number: ")
    while (2 > 1)
    {
        val userGuess:Int = readln()!!.toInt()
        if (userGuess == number)
        {
            println("Correct")
            break
        }
        else if (userGuess < number)
        {
            println("Increase your guess")
        }
        else
        {
            println("Decrease your guess")
        }
    }
}