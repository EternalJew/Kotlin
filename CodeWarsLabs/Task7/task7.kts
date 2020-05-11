 fun findShort(s: String): Int {
        val arr = s.split(" ").toTypedArray()
        var min = arr[0].length
        for (i in arr) {
            if (min > i.length) {
                min = i.length
            }
        }
        println("$min")
        return min

    }

    fun main(args: Array<String>) {
        findShort("lets talk about Kotlin the best language")
}
