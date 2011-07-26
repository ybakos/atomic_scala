// example for Case Classes

case class Person(name: String, var address: String, city: String)  {
    
}

val p1 = Person("Dianne", "Main", "Anywhere")
val p2 = Person("Bob", "County Rd", "Nowhere")
val p3 = Person("Tom", "Access", "Smallville")

val l = Vector(p1, p2, p3)

p3.address = "Hill Street"

l


