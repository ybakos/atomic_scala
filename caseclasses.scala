case class Dog (name: String)

val henry = Dog("Henry")
val cleo = Dog("Cleo")

val dogs = Vector(henry, cleo)

println(dogs)

case class Cat(name: String, age: Int)
val cats = Vector(Cat("Muffy", 3), Cat("Garfield", 2))
println(cats)