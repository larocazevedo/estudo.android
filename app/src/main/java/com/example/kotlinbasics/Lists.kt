package com.example.kotlinbasics

fun main() {

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    //quantos itens tem na lista
    print(anyTypes.size)
    //acessa a posição na lista (index)
    print(months[1])

    //pode usar loop tb
    for (month in months) {
        println(month)
    }

    // tornando uma lista imutável em mutável
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths) //adicionando todos da lista
    additionalMonths.add("July") //adicionando um item por vez
    // print(additionalMonths)

    val days = mutableListOf<String>("mon", "tue", "wen") //lista mutável
    days.add("thu") //pode adicionar valor
    days[2] = "Sunday" //pode substituir o valor existente
    days.removeAt(1) //removendo valor da lista

    val removeList = mutableListOf<String>("mon", "wen") //removendo itens específicos
    days.removeAll(removeList)

    days.removeAll(days) //removendo todos os itens da lista

    print(days)

}
