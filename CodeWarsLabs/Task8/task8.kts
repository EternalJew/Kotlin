//             1
//          3     5
//      7     9    11
//   13    15    17    19
//21    23    25    27    29
fun rowSumOddNumbers(n:Int) {
    var arr = arrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29)
        var firstIndex = 0
        for (i in 1..n) {
            firstIndex += i
        }
        var total = 0
        var i = firstIndex
        var h = firstIndex + n
        for (i in i..h) {
            total += arr[i]
        }
    println("$total")
}
fun main(args: Array<String>) {
    rowSumOddNumbers(0)
    rowSumOddNumbers(1)
    rowSumOddNumbers(2)
    rowSumOddNumbers(3)
    rowSumOddNumbers(4)
  
}
