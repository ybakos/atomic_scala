class Base {
	def f = 1
	def g = 2
	def h = 3
}

class Derived extends Base

val d = new Derived

d.f is 1
d.g is 2
d.h is 3

class Derived2 extends Derived {
	var n = 0
}

class More(arg: Int) extends Derived2 {
	n = arg * 2
	override def g = 42
	override def h = super.h * n + g
	def u = 3.14
}

val m = new More(3)
m.f is 1
m.g is 42
m.h is 60
m.u is 3.14
