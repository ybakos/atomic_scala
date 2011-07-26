import com.atomicscala.AtomicTest._

class Simple()

val s1 = new Simple()
val s2 = new Simple()

println(s1)
println(s2)

case class AutoField1(x: Int)
val af1 = AutoField1(11)
af1.x is 11

class AutoField2(val x: Int)
val af2 = new AutoField2(22)
af2.x is 22

class ExplicitField(x: Int) {
	val y: Int = x + 10
	val z = x * 10
	val q = y * z + 100
}

val ef1 = new ExplicitField(7)
val ef2 = new ExplicitField(12)
ef1.y is 17; ef1.z is 70; ef1.q is 1290
ef2.y is 22; ef2.z is 120; ef2.q is 2740

class Celsius(var temp: Double) {

	def set(newTemp: Double): Unit = {
		temp = newTemp
	}

	def fahrenheit(): Double = {
		temp * 9/5 + 32
	}
}
val c = new Celsius(0)
c.fahrenheit() is 32
