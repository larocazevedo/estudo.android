package com.example.kotlinbasics

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double) {

    //Abstract Property (Deve ser substituído por sua subclasse
    // se uma classe herdar de Mammal precisará implementá-los)
    abstract var maxSpeed: Double

    //Abstract Methods (deve ser implementado por subclasses)
    abstract fun run() //pode criar métodos sem um corpo
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main(){
    val human = Human("Denis", "Russia", 70.0, 28.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}