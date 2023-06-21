import kotlin.Pair

/**
 * Интерфейсы. Классы (final / open). Абстрактные классы.
 * Data классы.
 * Вложенные классы (статические / inner)
 */

interface DataSource {

	fun get(): Int
}

class Repository(
	private val networkDataSource: DataSource,
	public val publicInt: Int,
	protected val protectedInt: Int,
	internal var internalInt: Int,
	someValue: Int,
) {

	init {
		println("Я родился с числом $someValue")
	}

	private val value: Int = someValue
	var value2: Int = 55
		private set

	fun get(): Int = networkDataSource.get()
	fun getInt() = this.protectedInt
}

open class BaseDataSource : DataSource {

	open fun load() = 5

	override fun get(): Int = load()
}

abstract class AbstractDataSource : DataSource {

	abstract fun load(): Int
}

data class Pair<A, B>(
	val first: A,
	val second: B,
) {
	/*
		fun toString(): String
		fun equals(): Boolean
		fun hashCode(): Int

		fun copy(
			first: A = first,
			second: B = second,
		): Pair<A, B>

		fun component1(): A
		fun component2(): A
	 */
}

fun demoDataClass() {
	val pair = Pair(1, "2")
	val copiedPair = pair.copy(second = "90")
	val (first, second) = copiedPair
}

class NumberList {

	private val elements = mutableListOf<Element>()

	class Element(val number: Int)

	inner class Iterator {

		val iterator = elements.iterator()

		fun next(): Element = iterator.next()
	}
}

fun demoInnerClass() {
	val nl = NumberList()

	val element = NumberList.Element(4)
	val iterator = nl.Iterator()
//	val iterator = NumberList.Iterator()
}