import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sqrt

fun FirstTask(x:Double){
if(x>1){
    var y = 1/(x-1)
    println("FirsExample=$y")
}
else if(PI/4<=x||x<=1){
    var y = sqrt(abs(x+1))
    println("SecondExample=$y")
}
else if(-PI<x||x<PI/4){
    var y = -cos(x- PI)
    println("TripleExample=$y")
}
}
fun SecondTask(l:Double,k:Double){
    var a = (l-3*k)/5
    if(a>0){
        var A=a*2
        println("a=$A")
    }
    var b=(2*l+k)/k
    if(b>0) {
        var B = b * 2
        println("b=$B")
    }
    var d=l*k+6.5
    if(d>0) {
        var D = d * 2
        println("d=$D")
    }
}
fun main(args: Array<String>){
//lab3
    println("FirstTask:")
    FirstTask(5.0)
    println("SecondTask:")
    SecondTask(2.0,4.0)
}
