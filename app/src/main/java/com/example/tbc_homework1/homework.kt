package com.example.tbc_homework1

fun main() {

    println("       Welcome to the SUM calculator! ")
    print("Are you ready to start calculate? (yes or no): ")
    when (readLine()!!) {
        "yes", "Yes" -> sum()
        "no", "No" -> print("Calculate is over.")
        else -> println("Enter the yes or no!")
    }
}

fun sum() {
    try{
        print("Enter the first number: ")
        val x: Int = readLine()!!.toInt()
        print("Enter the second number: ")
        val y: Int = readLine()!!.toInt()
        val z = x + y
        println("   $x + $y = $z")
        print("Do you want calculate again? (yes or no): ")
        when (readLine()!!) {
            "yes", "Yes" -> return sum()
            "no", "No" -> print("Calculate is over.")
            else -> println("Enter the yes or no!")
        }
    }
    catch (e: NumberFormatException){
        println("Enter an integer in number field!")
    }
}








