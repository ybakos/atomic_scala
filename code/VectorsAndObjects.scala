// VectorsAndObjects.scala

val v1 = Vector(1, 3, 5, 7, 11, 13)  // A Vector holds other things
println(v1)

val n1 = v1(4) // "indexing" into a Vector
println(n1)

for(i <- v1) { // A for loop takes each element of the Vector
  print(i + " ") // Add a space after each number
}
println() // Add a newline after all the numbers

val v3 = Vector(1.1, 2.2, 3.3, 4.4)
println(v3.reverse) // reverse is an "operation" on the Vector

var v4 = Vector("Twas", "Brillig", "And", "The", "Slithy", "Toves")
println(v4)
println(v4.sorted) // Only if it can be sorted
println(v4.head)
println(v4.tail)

/* Output:
Vector(1, 3, 5, 7, 11, 13)
11
1 3 5 7 11 13
Vector(4.4, 3.3, 2.2, 1.1)
Vector(Twas, Brillig, And, The, Slithy, Toves)
Vector(And, Brillig, Slithy, The, Toves, Twas)
Twas
Vector(Brillig, And, The, Slithy, Toves)
*/
