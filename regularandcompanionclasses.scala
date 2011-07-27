import com.atomicscala.AtomicTest._

case class CaseClass(n: Int, s: String)

val cc1 = CaseClass(1, "hi")
val cc2 = CaseClass(1, "hi")
val cc3 = CaseClass(2, "hi")
cc1 == cc2 is true
cc1 == cc3 is false
cc2 != cc3 is true
cc3.n is 2
cc1 is "CaseClass(1,hi)"

def matchCaseClass(cc: CaseClass): String = {
	cc match {
		case CaseClass(n, s) => "n = " + n + " s = " + s
		case _ => "Everything else"
	}
}

matchCaseClass(cc1) is "n = 1 s = hi"

class Regular(n: Int, s: String)
val r1 = new regular(3, "hi")
