// code/ExceptionHandling.scala

import com.atomicscala.AtomicTest._

def readLinesFromFile(filename : String) {


	try {
		val file = new java.io.File(filename)
		val lines = scala.io.Source.fromFile(file).getLines
		lines.length is 10
	}
	catch {
		case ex : java.io.FileNotFoundException => println("Couldn't open file " + filename)

	}
	finally {
		println("the file was " + filename)
	}
}

readLinesFromFile("NonExistentFile")
readLinesFromFile("testfile.txt")

/* Output:
Couldn't open file NonExistentFile
the file was NonExistentFile
10
the file was testfile.txt
*/