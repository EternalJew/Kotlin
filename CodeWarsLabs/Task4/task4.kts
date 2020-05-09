fun highAndLow() {
    val str = "1 2 3 4 5 6 7"
    val strArr = str.split(" ").toTypedArray()
    val numArr = IntArray(strArr.size)
    for (i in strArr.indices) {
        numArr[i] = strArr[i].toInt()
    }
    var largestElement = numArr[0]

    for (number in numArr){
        if(largestElement < number)
            largestElement = number

    }
    println("Найдовше число в масиві: $largestElement")
    var shortestElement = numArr[0]
    for(number in numArr){
        if(shortestElement > number)
            shortestElement = number

    }
    println("Найкоротше число в масиві: $shortestElement")


}
fun main(args: Array<String>) {
highAndLow()
}
