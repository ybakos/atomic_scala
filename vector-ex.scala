// Write a script that creates Vector and populates it with words. Add a for loop that prints each element in the Vector in reverse order.
val bitizens = Vector("Larry", "Curly", "Moe")

for (bitizen <- bitizens.reverse) {
	println(bitizen)
}

// Create and initialize a List and Set with words, then print each one. Try the reverse and sort operations and see what happens.
val tasks = List("eat", "drink", "fuck")
val things = Set("beer", "drugs", "music")
// Sets don't support reverse, since they're unordered
// Nor do sets support sort.
// By default, sort asks for... something. sorted() on a Vector of strings will, by default, sort per alpha

// Create and initialize two vectors, one containing Ints and one containing Doubles. Call the sum, min and max operations on each.
val integers = Vector(8, 6, 7, 5, 3, 0, 9)
val doubles = Vector(4.20, 1.23, 4.56)

// Now create a Vector containing Strings and call sum, min and max on it and explain the results
val stooges = Vector("Larry", "Curly", "Moe", "Yong")
// sum doesn't work w/ strings but min and max do

// Create a Vector containing three elements, then index v(3). Does the result make sense?
val threeThangs = Vector("apples", "bananas", "dopamine")
// Yes, the index is out of bounds.

