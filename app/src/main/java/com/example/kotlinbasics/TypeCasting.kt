package com.example.kotlinbasics

fun main() {
    val stringList: List<String> = listOf("Denis", "Frank", "Michael", "Garry")
    val mixedTypeList: List<Any> = listOf("Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${Math.floor(value)}")
        } else if (value is String) {
            println("String: '$value' of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }

    /*for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' with Floor value ${Math.floor(value)}")
            is String -> println("String: '$value' of length ${value.length}")
            else -> println("Unknown Type")
        }
    }*/
}

