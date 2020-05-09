fun highAndLow() {
    val numbers: IntArray = intArrayOf(-7, 9, 3, 2, 6)
    var largestElement = numbers[0]

    for (number in numbers){
        if(largestElement < number)
            largestElement = number

    }
    println("Найдовше число в масиві: $largestElement")
    var shortestElement = numbers[0]
    for(number in numbers){
        if(shortestElement > number)
            shortestElement = number

    }
    println("Найкоротше число в масиві: $shortestElement")
}
fun main(args: Array<String>) {
highAndLow()
}
