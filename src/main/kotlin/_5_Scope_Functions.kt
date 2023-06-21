/**
 * Scope Functions
 */

fun main() {
	val list = listOf("1", "2", "3")

	// apply
	val list1 = mutableListOf<String>().apply {
		add("1")
		addAll(list)
	}

	// run
	val firstAndLast = list.run {
		listOf(first(), last())
	}

	// with
	with(mutableListOf<String>()) {
		add("1")
		addAll(list)
	}

	// also
	val list3 = list
		.map { it.toInt() }
		.also { println(it) }
		.filter { it < 5 }

	// let
	val firstIsEven = list
		.first()
		.let { isEven(it.toInt()) }
}