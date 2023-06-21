/**
 * Generics. Reified.
 */

data class Wrapper<T>(val value: T)

data class DestinationWrapper<T: Destination>(val res: T)

data class NonNullWrapper<T: Any>(val value: T)
//val s = NonNullWrapper<Int?>(null)

fun <T> List<T>.second(): T = this[1]

inline fun <reified T> List<*>.filterInstances(): List<T> =
	this.filter { it is T } as List<T>

//fun <T> List<*>.filterInstances(): List<T> =
//	this.filter { it is T } as List<T>

fun main() {
	listOf<Number>(1, 2.0, 3L)
		.filterInstances<Int>()		// filterIsInstance<Int>()
		.let { println(it) }
}
