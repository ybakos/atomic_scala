import com.atomicscala.AtomicTest._

def filterWithYield2(v: Vector[Int]) = {
	val result = for(n <- v
		if n < 10
		if n % 2 != 0)
			yield n
	result
}

def filterWithYield3(v: Vector[Int]) =
	for(n <- v
		if n < 10
		if n % 2 != 0)
	yield n

def filterWithYield4(v: Vector[Int]) =
	for(n <- v; if n < 10; if n % 2 != 0) yield n

def thingsA(thing: String): Int = {
	thing match {
		case "one" => 1
		case "two" => 2
	}
}

def thingsB(thing: String) = thing match {
	case "one" => 1
	case "two" => 2
}

thingsA("two") is 2
thingsB("one") is 1

class Simple(val s: String) {
	def getA() = s
	def getB = s
}

val simple = new Simple("Hey")
simple.getA() is "Hey"
simple.getA is "Hey"
simple.getB is "Hey"
