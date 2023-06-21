import java.util.LinkedList
import java.util.TreeMap

/**
 * Массив, коллекции (изменяемые и неизменяемые), реализации
 */

fun main() {
	val array = arrayOf(1, 2, 3,)

	val list: List<String> = listOf("1", "2", "2", "3")
	val set = setOf(1, 2, 2, 3)
	val map = mapOf(
		1 to "One",
		2 to "Two",
	)

	val generatedList = List(4) { index -> index.toString() }
	println(generatedList)

	val mutableList: MutableList<String> = mutableListOf("1", "2", "3")
	val mutableSet = mutableSetOf(1L, 2L, 3.0)
	val mutableMap = mutableMapOf(
		1 to "One",
		2 to "Two",
	)

	mutableList[1] = "99"			// mutableList.set(1, "99")
	val item = mutableList[1]		// mutableList.get(1)
	mutableList.add("90909")
	println(item)

	mutableMap[1] = "It's ONE"		// mutableMap.put(1, "It's ONE")
	println(mutableMap[1])			// mutableMap.get(1)


	val hashMap = HashMap<Int, String>()
	val linkedHashMap = LinkedHashMap<Int, String>()

	val hashSet = HashSet<Int>()
	val linkedHashSet = LinkedHashSet<Int>()

	// JVM
	val linkedList = LinkedList<Int>()
	val treeMap = TreeMap<Int, String>()
}