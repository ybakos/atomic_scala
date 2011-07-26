def function1(x: Int): Int = {
	println("Inside function 1")
	x * 2
}

var r1: Int = function1(5)
println(r1)

def function2(x: Int, y: Double, s: String): Double = {
	println(s)
	(x + y) * 2.1
}

var r2: Double = function2(7, 9, "Inside function 2")
println(r2)

def function3(): Unit = {
	println("Doesn't return anythang.")
}

function3()
