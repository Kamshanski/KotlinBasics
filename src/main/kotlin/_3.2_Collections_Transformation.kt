/**
 * Операции с коллекциями
 */
fun main() {
	val list = listOf("1", "2", "3")
	val list2 = listOf("10", "20", "30")

	(list + list2)							// ["1", "2", "3", "10", "20", "30"]
		.filter { it.length < 2 }			// ["1", "2", "3"]
		.map { it.toInt() }					// [1, 2, 3]
		.associateWith { it.toDouble() }	// { 1: 1.0,  2: 2.0,  3: 3.0}
		.toList()							// [Pair(1, 1.0), Pair(2, 2.0), Pair(3, 3.0)]
		.let { println(it) }


	val listOrList = listOf(listOf(0, 0), listOf(1, 1)) 			// [[0, 0], [1, 1]]
	val flattenList: List<Int> = listOrList.flatten()				// [0, 0, 1, 1]
	val string = flattenList
		.joinToString(separator = " ") { (it + 1).toString() }		// "1 1 2 2"
	println(string)


	if (list.any { it == "2" }) println("Тут есть 2")
	if (list.none { it == "7" }) println("Тут нет 7")
	if (list.all { it.length == 1 }) println("Все числа от 0 до 9")


	val numbers = listOf("one", "two", "three", "four", "five")
	println(numbers.groupBy { it.first().uppercase() }) 			// {O=[one], T=[two, three], F=[four, five]}
}