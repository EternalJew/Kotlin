package com.example.lesson1
fun FirstTask1(i:Double){
for (i:Int in 1..10){
    var p:Double = 0.0
    var u:Double= ((i*i+1)/(i*i*i+2)).toDouble();
    p += u;
    println("suma=$p")
}
}
fun FirstTask2() {

    for (k in 5..13){
        var k:Double = 5.0
        var p:Double = 1.0
      var  u:Double= ((k+3)/((k+5)*(k+6))).toDouble();
        println("FIRSTdobytok=$u")
        println("dobytok=$p")
        p *= u;
    }
    fun SecondTask(){
        for (i in 10..92) {
            var s: Double = 0.0
            if(i%2==0){
                s += i
                println("syma2$s")
            }
        }

}
fun main(args: Array<String>) {
    println("FirsTask:")
    FirstTask1(1.0)
    println("SecondTask:")
    FirstTask2()
    println("Task3:")
    SecondTask()
}
