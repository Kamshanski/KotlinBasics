@file:Suppress("KotlinConstantConditions")

import java.util.LinkedList

/**
 * Операторы in, is, as, !!, ==, ===. Nullable типы. Elvis оператор.
 */

fun main() {
	val list = listOf("1", "2", "3")

	val hasOne = "1" in list		// val hasOne = list.contains("1")    // true


	val isArrayList = list is ArrayList<String>	// true

	val arrayList = list as ArrayList<String>
	val linkedList: LinkedList<String>? = list as? LinkedList<String>

	val a = linkedList?.first()?.length ?: 0
//	val forceNonNull = linkedList!!
	val b = linkedList
		?.let { listOf(it.first()) }
		?: emptyList()


	val p1 = Pair(1, 2)
	val p2 = Pair(1, 2)
					//Kotlin	   Java				Result
	val equal       = p1 == p2 	// p1.equals(p2) 	true
	val equalRef    = p1 === p2 // p1 == p2			false
}