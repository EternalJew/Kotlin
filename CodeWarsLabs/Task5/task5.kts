package growth

fun nbYear(p0:Int, percent:Double, aug:Int, p:Int): Int {
    var a = p0
    var n = 0;
    while (a < p) {
        n++
        a = (a + (a*percent/100) + aug).toInt();
    }
    if (a >= p) {
        return n;
    }
    return n;
}
fun main(args: Array<String>) {
nbYear(1000,2.0,50,1200)
}
