// ParameterizedTypes.scala
import com.atomicscala.AtomicTest._

// Type is inferred:
val v1 = Vector(1,2,3)
val v2 = Vector("one", "two", "three")
// Exactly the same, but explcitly typed:
val p1: Vector[Int] = Vector(1,2,3)
val p2: Vector[String] = Vector("one", "two", "three")

v1 is p1
v2 is p2

// Return type is inferred:
def f(c1: Char, c2: Char, c3: Char) = {
  Vector(c1, c2, c3)
}

// Explicit return type:
def g(c1: Char, c2: Char, c3: Char): Vector[Char] = {
  Vector(c1, c2, c3)
}

f('a', 'b', 'c') is g('a', 'b', 'c')
