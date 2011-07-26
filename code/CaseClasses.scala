case class Dog (name: String)    


val dog1 = Dog("Henry")
val dog2 = Dog("Cleo")

val dogs = Vector(dog1, dog2)
println(dogs)

case class Cat(name: String, age: Int)
val cats = Vector(Cat("Miffy", 3), Cat("Rags", 2))
println(cats)


