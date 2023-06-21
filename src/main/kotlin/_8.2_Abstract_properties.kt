/**
 * Абстрактные свойства
 */

interface IntWrapper {

	val immutable: Int

	var mutable: Int
}

class IntWrapper1(initial: Int): IntWrapper {

	private val _immutable: Int = initial

	override val immutable: Int
		get() = _immutable


	private var _mutable: Int = initial

	override var mutable: Int
		get() { return _mutable }
		set(value) { _mutable = value }
}

class IntWrapper2(initial: Int): IntWrapper {

	override val immutable: Int = initial

	override var mutable: Int = initial
}