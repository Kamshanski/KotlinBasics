import java.lang.ref.WeakReference

/**
 * Слабые ссылки
 */

class View

fun main() {
	var view: View? = View()				// Сильная ссылка
	val viewWeakRef = WeakReference(view)	// Слабая ссылка
	// view == View, 	viewWeakRef.get() == View

	view = null								// Зануляю сильную ссылку
	// view == null, 	viewWeakRef.get() == View
	
	System.gc() 							// Насильный вызов сборщика мусора
	// view == null, 	viewWeakRef.get() == null

	println(viewWeakRef.get()) 				// null
}