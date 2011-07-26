// ForExpressions.scala
import com.atomicscala.AtomicTest._

def filter(): String = {
  val v3 = Vector(1,2,3,5,6,7,8,10,13,14,17)
  val result = new StringBuilder
  for(n <- v3 
      if n > 5 
      if n % 2 == 0) {
        result.append(n + " ")
  }
  result.toString
}

filter() is "6 8 10 14 "

def filterWithYield(): Vector[Int] = {
  val v3 = Vector(1,2,3,5,6,7,8,10,13,14,17)
  val result = for(n <- v3 
      if n < 10 
      if n % 2 != 0)
        yield n
  result
}

filterWithYield() is Vector(1,3,5,7)
