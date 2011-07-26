// example for Inheritance

case class Person(name: String, address: String, city: String) extends Ordered[Person] {
     def compare(that: Person) = name.compare(that.name)
}

val p1 = Person("Dianne", "Main", "Anywhere")
val p2 = Person("Bob", "County Rd", "Nowhere")
val p3 = Person("Tom", "Access", "Smallville")

val l = Vector(p1, p2, p3)
l.sorted

