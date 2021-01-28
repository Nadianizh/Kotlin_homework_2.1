package ru.netology

fun main() {

    val amount1 = 400
    val amount2 = 100000
    val minInterest = 3_500
    val interestRate = 0.75

    transfer(amount1, minInterest, interestRate)
    transfer(amount2, minInterest, interestRate)
}

fun transfer(amount: Int, minInterest: Int, interestRate: Double){
    val interest = if (amount/interestRate > minInterest)
        (amount* interestRate).toInt() else minInterest

    println("Перевод $amount коп. выполнен, комиссия $interest коп.")
}