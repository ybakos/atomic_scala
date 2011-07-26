import com.atomicscala.AtomicTest._

val v1 = Vector(1, 3, 5, 7, 11, 13)
val v2 = Vector(7, 9, 11, 13, 15, 17)
val x1 = v1.union(v2)
val x2 = v1 union v2
println(x1)
println(x2)
val x3 = v1.intersect(v2)
val x4 = v1 intersect v2
println(x3)
println(x4)

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

var v4 = Vector("Hey", "Ho", "Hey", "Ho")
v4.sorted is "Vector(Hey, Hey, Ho, Ho)"
v4.head is "Hey"
v4.tail is "Vector(Hey, Ho, Ho)"
v4 is "Vector(Hey, Ho, Hey, Ho)"

"foo" is "bar"

"x" is "y"