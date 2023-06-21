@file:Suppress("KotlingContawdasd")

import kotlin.reflect.KClass

/**
 * Аннотации
 */

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
annotation class MyAnnotation(
	val value: Int = 5,
	val loanProduct: LoanProducts = LoanProducts.POS,
	val type: KClass<*> = Int::class,
)


@MyAnnotation(value = 3, loanProduct = LoanProducts.CONSUMER, type = Long::class)
val myProperty: Int = 5

//@MyAnnotation
class MyClass