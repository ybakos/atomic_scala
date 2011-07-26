// Functions.scala
// Define a function:
def function1(x: Int): Int = {
  println("Inside function1")
  x * 2 // Return value
}

var r1: Int = function1(5) // Call the function
println(r1)

def function2(x: Int, y: Double, s: String): Double = {
  println(s)
  (x + y) * 2.1
}

var r2: Double = function2(7, 9, "Inside function2")
println(r2)

def function3(): Unit = {
  println("Doesn't return anything")
}

function3()

/* Output:
Inside function1
10
Inside function2
33.6
Doesn't return anything
*/
