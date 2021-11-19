package com.me.dogdog

class Test() {
    var name: String?=null

        set(value) {
            field = value
        }

    init {
        name = "111"
    }
}

fun main() {
   val test = Test()
    println(test.name)
}