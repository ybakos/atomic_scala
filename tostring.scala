import com.atomicscala.AtomicTest._

case class Bicycle(riders: Int)

val forTwo = Bicycle(2)
forTwo is "Bicycle(2)"

class Surrey(val adornment: String)
val fancy = new Surrey("fringe on top")
println(fancy)

class Surrey2(val adornment: String) {
	override def toString = "Surrey with the " + adornment
}

val fancy2 = new Surrey2("fringe on top")
fancy2 is "Surrey with the fringe on top"
