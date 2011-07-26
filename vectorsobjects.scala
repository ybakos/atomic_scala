val v1 = Vector(1, 3, 5, 7, 11, 13)
println(v1)

val n1 = v1(4)
println(n1)

for(i <- v1) {
	print(i + " ")
}
println()

val v3 = Vector(1.1, 2.2, 3.3, 4.4)
println(v3.reverse)

var v4 = Vector("Hey", "Ho", "Hey", "Ho")
println(v4)
println(v4.sorted)
println(v4.head)
println(v4.tail)