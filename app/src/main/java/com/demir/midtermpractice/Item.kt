package com.demir.midtermpractice

data class Item(val name: String, val price: Int, val qty: Int)


fun total(items: List<Item>): Int = items.sumOf { it.qty * it.price }


fun discountPercent(code: String?) : Int = when (code?.uppercase()) {
    "KOTLIN10" -> 10
    else -> 0
}

fun main() {

    val myCart = listOf(Item("Laptop", 1000, 4), Item("Fridge", 600, 2), Item("Smartphone", 700, 5))
    val sum = total(myCart);
    for (code in listOf(null, "sometingelse", "KOTLIN10", null)){
        var final = sum - (sum * discountPercent(code) / 100)
        println("Code=$code -> $final")
    }
}