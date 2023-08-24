package com.example.kotlinbasics

fun main() {

    val fruits = setOf("orange", "apple", "grape", "mango", "apple", "orange")
    //print(fruits.size)
    //print(fruits.toSortedSet()) //organiza em ordem alfabética

    val newFruits = fruits.toMutableList() //transformando a lista em mutável
    newFruits.add("water melon")
    newFruits.add("pear")
    // println(newFruits.elementAt(4)) //acessa uma determinada fruta em sua lista

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //print(daysOfTheWeek[2])

    /* for (key in daysOfTheWeek.keys) {
        print("$key is to ${daysOfTheWeek[key]}")
    } */

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    print(newDaysOfWeek.toSortedMap())


    //as conexões dos mapas podem ser feitas também entre Strings e outros tipos de dados
    val fruitMap = mapOf(
        "Favorite" to Fruits("Grape", 2.5),
        "ok" to Fruits("Apple", 1.5))
}

data class Fruits(val name: String, val price: Double)
