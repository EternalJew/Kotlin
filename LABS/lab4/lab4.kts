import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sqrt

fun FirstTask(){
    var xp=3.8
    var xk = 7.6
    var dx = 0.6
while (xp<xk){
    var y = cos(xp.pow(xp))
    xp += dx
    println("XP=$xp")
    println("Y=$y")
}
}
//Суть цього завдання зациклити функцію з використанням двох операторів "While"
fun SecondTask(){
var y:Double = 0.0
    while (y<=7){
        var x:Double  = 0.0
        while (x<=5){
           var z=x*y+sqrt((x+y).toDouble())

            println("z=$z")
            println("X=$x")
            println("Y=$y")
            x+=0.5 }
        y += 1.5
    }
}
fun main(args: Array<String>) {
    //lab4
    println("FirstTask:")
    FirstTask()
    println("SecondTask:")
    SecondTask()

}
