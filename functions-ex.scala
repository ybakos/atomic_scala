// Create a function that takes an integer argument and returns its square.
def square(x: Int): Int = {
	x * x
}

// Create a function that takes a floating point argument and  returns its square. How does this differ from Exercise #1?
def squareFloat(x: Float): Float = {
	x * x
}

// Create a function that takes a floating point argument and and an integer argument. Return true if the integer is greater than the floating point argument. Return false otherwise.
def isGreater(x: Int, y: Float): Boolean = {
	return x > y
}
// Create a function that takes a string and returns the same string.
def echo(x: String): String = {
	x
}

// Create a function that takes 2 strings as arguments, and returns the strings added together. Did this do what you expected?
def cat(x: String, y: String): String = {
	return x + y
}
// Yes, it did, which means there's some operator overloading

// You wrote a function, above, that takes a floating point argument and returns its square. Change the argument from floating point to a string. What happens? Can you explain why
def squareEh(x: String): String = {
	return x * x
}
// * is not overloaded for String
