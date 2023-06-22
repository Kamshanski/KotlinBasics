import kotlin.Pair

/**
 * Object. Companion object. Const val
 */

object Singleton {

	val PAIR = Pair(1, 2)
	const val PHONE = "+79000000000"
}

class ClassWithCompanion {

	companion object {
		const val EMAIL = "abc@mail.com"
	}
}

class ClassWithFriend {

	companion object Friend {
		const val EMAIL = "abc@mail.com"
	}
}

fun main() {
	ClassWithCompanion.EMAIL
	ClassWithCompanion.Companion.EMAIL
	ClassWithFriend.EMAIL
	ClassWithFriend.Friend.EMAIL

}