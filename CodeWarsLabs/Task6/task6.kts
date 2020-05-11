fun inviteMoreWomen(){
    var arr = arrayOf(1,-1,1)
val a: Boolean= true
    val b: Boolean = false
    var count = 0
    for(el in arr){
        if(el == 1) count++
        else if(el == -1) count--
    }
if (count == 0){
    println("$b")
}
    else{
    println("$a")
    }
}
fun main(args: Array<String>) {
    inviteMoreWomen()
}
