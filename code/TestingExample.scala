// TestingExample.scala
import com.atomicscala.AtomicTest._

// Scala allows a "natural" alternative syntax
val v1 = Vector(1, 3, 5, 7, 11, 13)
val v2 = Vector(7, 9, 11, 13, 15, 17)
val x1 = v1.union(v2) // Remember your Venn diagrams?
val x2 = v1 union v2  // Alternative Scala syntax
println(x1)
println(x2)
val x3 = v1.intersect(v2)
val x4 = v1 intersect v2  // Alternative Scala syntax
println(x3)
println(x4)

// We can use the "natural" syntax for test expressions:
v1 is "Vector(1, 3, 5, 7, 11, 13)"
v1(4) is 11

val sb = new StringBuilder
for(i <- v1) {
  sb.append(i + " ")
}

sb is "1 3 5 7 11 13 "

val v3 = Vector(1.1, 2.2, 3.3, 4.4)
v3.reverse is "Vector(4.4, 3.3, 2.2, 1.1)"
v3.reverse is Vector(4.4, 3.3, 2.2, 1.1)

var v4 = Vector("Twas", "Brillig", "And", "The", "Slithy", "Toves")
v4.sorted is "Vector(And, Brillig, Slithy, The, Toves, Twas)"
v4.head is "Twas"
v4.tail is "Vector(Brillig, And, The, Slithy, Toves)"
v4 is "Vector(Twas, Brillig, And, The, Slithy, Toves)"

"foo" is "bar" // Produces a simple error message

/* Output:
Vector(1, 3, 5, 7, 11, 13, 7, 9, 11, 13, 15, 17)
Vector(1, 3, 5, 7, 11, 13, 7, 9, 11, 13, 15, 17)
Vector(7, 11, 13)
Vector(7, 11, 13)
Vector(1, 3, 5, 7, 11, 13)
11
1 3 5 7 11 13 
Vector(4.4, 3.3, 2.2, 1.1)
Vector(4.4, 3.3, 2.2, 1.1)
Vector(And, Brillig, Slithy, The, Toves, Twas)
Twas
Vector(Brillig, And, The, Slithy, Toves)
Vector(Twas, Brillig, And, The, Slithy, Toves)
foo [Error] expected: 
bar
*/
