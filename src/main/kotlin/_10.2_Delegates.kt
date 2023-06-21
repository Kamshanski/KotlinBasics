import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable
import kotlin.reflect.KProperty

/**
 * Делегаты
 */

class DelegateSample {

	var number by observable(initialValue = 5) { property, oldValue, newValue ->
		println("Property '${property.name}' changed from $oldValue to $newValue")
	}

	var string by vetoable(initialValue = "String") { property, oldValue, newValue ->
		if (newValue.isEmpty()) {
			println("Пустая строка недопустима")
			false
		} else {
			println("Строка '$oldValue' заменена на '$newValue'")
			true
		}
	}
}

fun defaultDelegateUsage() {
	val sample = DelegateSample() // number = 5, string = "String"
	sample.number = 9			  // number = 9, string = "String"
	sample.string = ""			  // number = 9, string = "String"
	sample.string = "123"		  // number = 9, string = "123"
}




interface IntDelegate {

	operator fun getValue(thisRef: Any?, property: KProperty<*>): Int
	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int)
}

class MyIntDelegate(private var myNumber: Int) : IntDelegate {

	override fun getValue(thisRef: Any?, property: KProperty<*>): Int =
		myNumber

	override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
		myNumber = value
	}
}

fun customDelegateUsage() {
	var number by MyIntDelegate(5)
	println(number) // 5

	number = 7
	println(number) // 7
}






interface NavDelegate {

	fun goBack()
}
class MyNavDelegate : NavDelegate {

	override fun goBack() { println("I go back") }
}

class Controller(
	private val navDelegate: NavDelegate,
) : NavDelegate by navDelegate


fun classDelegateUsage() {
	val myDelegate = MyNavDelegate()
	val controller = Controller(myDelegate)

	controller.goBack()
}



fun main() {
	classDelegateUsage()
	customDelegateUsage()
	defaultDelegateUsage()
}

