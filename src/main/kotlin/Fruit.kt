// Глава 2, стр 83
fun main(args: Array<String>) {
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y: Int
    val index = arrayOf(1, 3, 4, 2)
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}