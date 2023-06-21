import kotlin.random.Random

/**
 * Условия if. Возврат значения из if. Логические операторы.
 * Условия when. Сравнение по шаблону.
 */

fun main() {
	val num = Random.nextInt()

	if (num < 5) {
		println("< 5")
	} else if (num < 100) {
		println("5 <= x < 100")
	} else {
		println(">= 100")
	}

	val result = if (num < 5) {
		"< 5"
	} else if (num < 100) {
		"5 <= x < 100"
	} else {
		">= 100"
	}
	println(result)

	if (num >= 6 && num <= 10) println("$num in range 6..10")
	if (num < 6 || num > 10) println("$num out of range 6..10")
	if (num == 2) println("$num is 2")
	if (!(num == 2)) println("$num is not 2")
	if (num != 2) println("$num is not 2")

	val result2 = when (num) {
		1          -> "One"
		2          -> "Two"
		3, 4, 5    -> "3-5"
		in 6..10   -> "6-10"
		is Number  -> "Number"
		else       -> "Another"
	}
	println(result2)

	when {
		num is Number -> {
			println("Num = ")
			print(num)
		}

		num > 90      -> {}
	}
}