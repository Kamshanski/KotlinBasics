/**
 * Extension fun. Infix fun. Operator fun. Inline fun.
 */

fun Int.isEven(): Boolean =
	this % 2 == 0

infix fun String.has(part: String): Boolean =
	this.contains(part)

operator fun String.div(other: String): List<String> =
	this.split(other)

inline fun runRequest(body: () -> Unit) {
	println("Start")
	body()
	println("Finish")
}

fun main() {
	println(3.isEven())

	println("12345" has "34")

	println("1, 2, 4, 5" / ", ")

	runRequest {
		println("Do request")
	}
}