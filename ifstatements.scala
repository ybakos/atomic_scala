import com.atomicscala.AtomicTest._

def simple(exp: Boolean): String = {
	if (exp) {
		return "TRUE!"
	}
	"FALSE"
}

simple(true) is "TRUE!"
simple(false) is "FALSE"

def withElse(exp: Boolean): String = {
	if (exp) {
		"TRUE"
	} else {
		"FALSE"
	}
}

val v = Vector(1)
val v2 = Vector(3, 4)
withElse(v == v.reverse) is "TRUE"
withElse(v2 == v2.reverse) is "FALSE"

def assignResult(arg: Boolean): Int = {
	val result= if(arg) 42 else 47
	result
}

assignResult(true) is 42
assignResult(false) is 47
