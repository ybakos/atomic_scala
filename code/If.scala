// If.scala
import com.atomicscala.AtomicTest._

def simple(exp: Boolean): String = {
  if(exp) {
    return "It's true!" // 'return' necessary
  }
  "It's false"
}

simple(true) is "It's true!"
simple(false) is "It's false"
    
def withElse(exp: Boolean): String = {
  if(exp) {
    "It's true!" // No 'return'
  } else {
    "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
withElse(v == v.reverse) is "It's true!"
withElse(v2 == v2.reverse) is "It's false"

def elseIf(exp1: Boolean, exp2: Boolean): String = {
  if(exp1 && exp2) {
    "Both are true"
  } else if(!exp1 && !exp2) {
    "Both are false"
  } else if(exp1) {
    "First: true, second: false"
  } else {
    "First: false, second: true"
  }
}

elseIf(true || false, true) is "Both are true"
elseIf(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
elseIf(1 >= 2, 1 >= 1) is "First: false, second: true"
elseIf(true && false, false && true) is "Both are false"

def assignResult(arg: Boolean): Int = {
  val result = if(arg) 42 else 47
  result
}

assignResult(true) is 42
assignResult(false) is 47
