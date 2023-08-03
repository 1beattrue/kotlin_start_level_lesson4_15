fun main() {
    // Generic
    val list: MyList<String> = MyArrayList()
    for (i in 0..100) list.add("$i")
    for (i in 0..90) list.removeAt(0)
    for (i in 0..<list.size()) println(list.get(i))

    val listInt: MyList<Int> = MyArrayList()
    for (i in 0..100) listInt.add(i)
    for (i in 0..90) listInt.removeAt(0)
    for (i in 0..<listInt.size()) println(listInt.get(i))

    // таким образом, мы получили обобщенную коллекцию для разных типов данных
}