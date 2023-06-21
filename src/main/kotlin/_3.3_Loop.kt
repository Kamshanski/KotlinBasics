/**
 * Циклы, диапазоны
 */
fun main() {
	val list = listOf(1, 2, 3)

	for (item in list) {
		print("$item ")
	}

	println()
//  Или (index in 0..(list.size - 1))
//  Или (index in 0..list.lastIndex)
//  Или (index in list.indices)
	for (index in 0 until list.size) {
		print("${list[index]} ")
	}

	println()
	for (index in list.lastIndex downTo 0) {
		print("${list[index]} ")
	}

	println()
	list.forEach {
		print("$it ")
	}

	println()
	list.forEachIndexed { index, item ->
		print("$index : $item, ")
	}

	println()

	var i = 0
	while (i < list.size) {
		print("${list[i]} ")
		i++
	}

	println()

	i = -1
	do {
		print("${i} ")
		i++
	} while (i < 6)
}