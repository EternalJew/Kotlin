fun getCount(str : String) : Int {
    var Count = 0;

    for (x in str) {
        if (x == 'a') {
            Count++;
        }
        else if (x == 'e') {
            Count++;
        }
        else if (x == 'i') {
            Count++;
        }
        else if (x == 'o') {
            Count++;
        }
        else if (x == 'u') {
            Count++;
        }

    }
    println("$Count")
    return Count;
}
fun main(args: Array<String>) {
getCount("mami ell on under")
}

