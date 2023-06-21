/**
 * Ленивые свойства
 */

val lazyValue by lazy {
	println("Value is created")
	55 + 23
}

fun main() {
	println("Start")
	println(lazyValue)
	println("End")
}