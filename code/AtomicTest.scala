// AtomicTest.scala
// A tiny little testing framework, to display results and to introduce
// and promote unit testing early in the learning curve.
/* To use in a script, you must include the following import:
import com.atomicscala.AtomicTest._
(No AtomicTest{} block is needed in a script).
To use in compiled code, you must include the following imports:
import com.atomicscala.AtomicTest
import com.atomicscala.AtomicTest.any2Atomic
and you must also put the test code inside either a
AtomicTest("Description of tests") {
  test code
}
or without the description:
AtomicTest {
  test code
}
*/

package com.atomicscala {

  class AtomicTest(val target: Any) {
    def is(expected: Any) = AtomicTest.test(this, expected)
  }

  object AtomicTest {
    implicit def any2Atomic(source: Any) = new AtomicTest(source)
    def apply(descr: String)(body: => Unit): Unit = {
      body
    }
    def apply(body: => Unit): Unit = {
      body
    }
    def test(actual:AtomicTest, expected:Any) = {
      val lval = actual.target
      print(lval)
      expected match {
        case s:String =>
          if(expected != lval.toString)
       	    println(" [Error] expected: \n" + expected)
     	  else
       	    println
        case _ =>
          if(expected != lval)
       	    println(" [Error] expected: \n" + expected)
     	  else
       	    println
      }
    }
  }

}
