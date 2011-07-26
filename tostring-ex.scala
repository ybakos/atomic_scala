// Modify Bicycle so that its toString says "Bicycle built for 2"
import com.atomicscala.AtomicTest._

case class Bicycle(riders: Int) {
	override def toString = "Bicycle built for " + riders
}

val forTwo = Bicycle(2)
forTwo is "Bicycle built for 2"
