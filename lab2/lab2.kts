fun FirstTask(a:Double,b:Double){
    var x = sin((a*a*a)-asin(1/b))/(log(abs(a+b)) +1)
    var z = sqrt(abs((a+b)/(a*b))+ PI)
    var y = x+z
   // (x.pow(x)-z.pow(z))/(log10(abs(x-7)))
    println("x=$x")
    println("z=$z")
    println("y=$y")
}
fun SecondTask(all:Double,two:Double,three:Double,four:Double,five:Double){
var x = ((five+four)/all)*100
    var y = (((five*5)+(four*4)+(three*3)+(two*2))/(all))
    println("proggress=$x")
    println("avarage=$y")
}
fun main(args: Array<String>) {
    //lab2
    FirstTask(3.5,-2.16)
    SecondTask(15.0,6.0,4.0,2.0,3.0)
}
