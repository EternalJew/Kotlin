package maxrot

fun maxRot(n:Long):Long {
    var i = (n).toString()
    var ZeroChar = ""
    var mx = n
    if (i.length == 1) return n
    while (true)
    {
      // переміщення вліво
      var r = i.substring(1) + i.get(0)
      i = r
      // Заморозимо першу змінну
      ZeroChar += i.get(0)
      // фіналочка
      i = i.substring(1)
      val nb = java.lang.Long.parseLong(ZeroChar + i)
      if (nb > mx) mx = nb
      if (i.length == 1) break
    }
    return mx
}
