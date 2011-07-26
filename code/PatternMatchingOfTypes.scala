// PatternMatchingOfTypes.scala

def doSomethingInteresting(x : Any) =
x match {
  case s: String => println("It's a String and its value is " + s)
  case i: Int => println("It's an Int and its value is " + i)
  case p: Person => println("It's a person named " + p.name)
  case _ => println("I don't know what that is!")
}

doSomethingInteresting(5)
doSomethingInteresting("Some text")

case class Person(name: String)
val bob = Person("Bob")
doSomethingInteresting(bob)

doSomethingInteresting(Vector(1, 2, 5))
/* Output:
It's an Int and its value is 5
It's a String and its value is Some text
It's a person named Bob
I don't know what that is!
*/
