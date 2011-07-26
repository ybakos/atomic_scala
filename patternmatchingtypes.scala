def doSomethingInteresting(x: Any) {
	x match {
		case s: String => println("It's a String and it is " + s)
		case i: Int => println("It's an Int and it is " + i)
		case p: Person => println("It's a Person named " + p.name)
		case _ => println("I don't know what that shit is.")
	}
}

doSomethingInteresting(5)
doSomethingInteresting("Hey")
case class Person(name: String)
val bob = Person("Bob")
doSomethingInteresting(bob)

doSomethingInteresting(Vector(1, 2, 5))
