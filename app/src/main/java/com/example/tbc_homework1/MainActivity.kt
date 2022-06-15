package com.example.tbc_homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private fun main(args: Array<String>) {
        print("Enter text: ")

        val stringInput = readLine()!!
        println("You entered: $stringInput")
    }
}

