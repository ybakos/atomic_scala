// Store the value 5 as an integer.
val monkeys: Int = 56

// Store the value 17 as a long.
val drinks: Long = 17

// Store the value ABC1234 as a string.
val jackson5 = "ABC1234"

// Store the floating point value 5.4.
val pizzas: Float = 5.4f

// Store the double 15.56.
val beers: Double = 15.56

// Store the value true.
val isYongKing = true

// Store a multi-line string.
val lyrics = """The problem is all inside your head
she said to me
the answer is easy if you take it logically"""

// What happens if you try to store the String maybe in a Boolean?
val maybe: Boolean = "maybe"
// error: type mismatch;
// found: java.lang.String("maybe")
// required: Boolean

// What happens if you try to store the number 15.4 in an integer value?
val test01: Int = 15.4
// Another type mismatch

// What happens if you try to store the number 15L in an integer // value?
val test02: Int = 15L
// And another type mismatch

// What happens if you try to store the number 15 in a floating point value?
val test03: Float = 15
// Coerces the int into a float.

