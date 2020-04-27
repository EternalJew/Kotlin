package com.example.lesson1
fun firsttask(){
    var mas = arrayOf(5.0,-2.3,-6.9,-1.1,2.0,6.6)
    var s = 0.0
    for (el in mas) {
            if (el>0){
                s+=el
                println("syma=$s")
            }
    }
}
fun secondtask2(){
    var arr = arrayOf(6.3,5.3,-2.2,-3.3,0.0,2.1)
    arr.sort()
    println("${arr.contentToString()}")

}
fun main(args: Array<String>){
firsttask()
    secondtask2()
}
