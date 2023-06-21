/**
 * Типы данных. Переменные. Строки обычные и многострочные. Вывод в консоль. Конкатенация строк и шаблоны строк. Конвертация типов.
 */

fun main() {
	val int: Int = 1
	val long: Long = 1L
	val double: Double = 1.0
	val float: Float = 1.0f
	val char: Char = 'a'
	val boolean: Boolean = true

	var string = "string"
	string = """I'm a long string"""

	val multilineString: String = """
		I'm a multiline string
		У меня много строк
	""".trimIndent()
	val multilineString2: String = """
		|I'm a multiline string
		|У меня много строк
	""".trimMargin()

	println("\nMultiline string:")
	println(multilineString)
	println("\nMultiline string2:")
	println(multilineString2)

	println()
	println("Print: " + int.toString())
	println("Print: " + int)
	println("Print: $int")
	println("Print: ${int + 1}")

	println()
	println("Int -> Double: ${int.toDouble()}")
}

typealias UserId = String