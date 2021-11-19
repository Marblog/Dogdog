package com.me.dogdog

fun main() {
   val  sumlambda:(Int,Int)->Int={x,y->x+y}
    println(sumlambda(1,2))
}

fun vars(vararg v:Int){
    for (vt in v){
        print(vt)
    }
}
