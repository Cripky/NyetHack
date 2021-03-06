package com.bignerdranch.nyethack

val String.numVowels
    get() = count { "aeiouy".contains(it) }

fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun String?.printWithDefault(default: String) = print(this ?: default)

fun main() {
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()
    "How many vowels?".numVowels.easyPrint()

    val nullableString: String? = null
    nullableString.printWithDefault("Default string")
}
