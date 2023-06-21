import kotlin.random.Random

/**
 * Исключения и ошибки. Nothing
 */

fun main() {
	val n = Random.nextInt()

	try {
		fatalError("Num is negative")
	} catch (e: MyFatalException) {
		println(e.message)
		e.printStackTrace()
	} finally {
		println("Finally exit")
	}

	val result = try {
		require(n > 0)
		n
	} catch (e: IllegalArgumentException) {
		0
	}
}

class MyFatalException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

//@Throws(MyFatalException::class)
fun fatalError(message: String): Nothing {
	throw MyFatalException(message)
}