/**
 * Лямбды.
 */
fun main() {
	val lambda: () -> Unit = { println("Lambda") }

	var lambda2: (Int) -> Int
	lambda2 = { it + 1 }					// Swift { $0 + 1 }
	lambda2 = { number -> number + 1 }
	lambda2 = { number: Int -> number + 1 }

	val lambda3: (a: Int, b: Int) -> Unit = { a, b ->
		println(a)
		println(b)
	}

	val pow: Double.(Double) -> Double = { Math.pow(this, it) }
	println(4.0.pow(2.0))
}