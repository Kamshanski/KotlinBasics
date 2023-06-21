/**
 * Enum class. Sealed class/interface. When с enum/sealed
 */

enum class LoanProducts(val id: Int) {
	EXPRESS(10),
	POS(20),
	CONSUMER(400),
	;

	fun commonFun() {}
	open fun openFun() {}
}

fun demoEnum() {
	val products = LoanProducts.values()
	val expressEntry = LoanProducts.valueOf("EXPRESS")
	val posName = LoanProducts.POS.name
	val posOrdinal = LoanProducts.POS.ordinal

	val product = products.random()
	when (product) {
		LoanProducts.EXPRESS  -> println("Express loan")
		LoanProducts.POS,
		LoanProducts.CONSUMER -> println("Other loan")
	}
}



sealed class Resource(val id: String) {

	class Image(
		id: String,
		val width: Int,
		val height: Int,
		val pixels: Array<Int>,
	) : Resource(id)

	class Text(
		id: String,
		val text: String,
	) : Resource(id)
}

fun demoSealedClass(res: Resource) {
	when (res) {
		is Resource.Image -> println("Image ${res.width}x${res.height}")
		is Resource.Text  -> println("Text '${res.text}'")
	}
}



sealed interface Destination {

	object RootDestination : Destination

	data class LoanDestination(val loanId: String) : Destination

	data class EwalletDestination(val walletId: String) : Destination
}

fun demoSealedInterface(destination: Destination) {
	when (destination) {
		is Destination.EwalletDestination -> println("Ewallet ${destination.walletId}")
		is Destination.LoanDestination    -> println("Loan ${destination.loanId}")
		Destination.RootDestination       -> println("Root")
	}
}




fun main() {
	demoEnum()
	demoSealedClass(Resource.Text("123", "My text"))
	demoSealedInterface(Destination.EwalletDestination("123"))
}