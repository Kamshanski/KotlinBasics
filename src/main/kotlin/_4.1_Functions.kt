/**
 * Функции. Аргументы функций. vararg. Объект Unit.
 */

fun foo(int: Int, long: Long = 3L, vararg strings: String): Int {
	foo(1, 2, "1", "2", "3", "4")

	foo(1, long = 3L)

	val array = arrayOf("1", "2", "3", "4")
	foo(long = 3L, strings = array, int = 1)


	return 5
}

fun noReturn(): Unit {}
fun noReturn2() {}
fun noReturn3() = Unit

fun isEven(number: Int): Boolean =
	if (number % 2 == 0) {
		true
	} else {
		false
	}

fun main() {
	println(isEven(4))
}