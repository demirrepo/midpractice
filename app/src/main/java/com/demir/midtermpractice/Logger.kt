package com.demir.midtermpractice

object Logger {

    private val myList = mutableListOf<String>()
    fun log(msg: String) {
        myList.add(msg)
    }





}