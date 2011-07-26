// PatternMatching.scala (Run as script)

trait Color
case class Red(saturation: Int) extends Color
case class Green(saturation: Int) extends Color
case class Blue(saturation: Int) extends Color

def matcher(arg:Any): String = arg match {
  case "Chowder" => "Make with clams"
  case x: Int => "An Int with value " + x
  case Red(100) => "Red sat 100"
  case Green(s) => "Green sat " + s
  case c: Color => "Some Color: " + c
  case w: Any => "Whatever: " + w
  case _ => "Default, but Any captures all"
}

val v = Vector(1, "Chowder", Red(100), Green(50), Blue(0), 3.14)
v.foreach(x => println(matcher(x)))
