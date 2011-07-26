import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3)
val v2 = Vector("one", "two", "three")

val p1: Vector[Int] = Vector(1, 2, 3)
val p2: Vector[String] = Vector("one", "two", "three")

v1 is p1
v2 is p2

def f(c1: Char, c2: Char, c3: Char) = {
	Vector(c1, c2, c3)
}

def g(c1: Char, c2: Char, c3: Char): Vector[Char] = {
	Vector(c1, c2, c3)
}
f('a', 'b', 'c') is g('a', 'b', 'c')