import com.atomicscala.AtomicTest._

def filter(v: Vector[Int]): Vector[Int] = {
	var result = Vector[Int]()
	for (n <- v
		if n > 5
		if n % 2 == 0) {
			result = result :+ n
	}
	result
}

val v = Vector(1, 2, 3, 4, 5, 6, 7, 8, 10, 13, 14, 17)
filter(v) is Vector(6, 8, 10, 14)

def filterWithYield(v: Vector[Int]): Vector[Int] = {
	val result = for(n <- v
		if n < 10
		if n % 2 != 0) 
			yield n
	result
}

filterWithYield(v) is Vector(1, 3, 5, 7)
