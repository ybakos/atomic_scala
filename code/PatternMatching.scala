// PatternMatching.scala

def printColor(color: String) =  {
  color match {
    case "red" => println("RED")
    case "blue" => println("BLUE")
    case "green" => println("GREEN")
    case _ => println("UNKNOWN COLOR: " + color)
  }
}

printColor("blue")
printColor("white")

def getColorShade(shade: Int) = {
  shade match {
    case 1  => "light"
    case 2  => "medium"
    case 3  => "dark"
    case _  => "unknown"
  }
}

println(getColorShade(1))
println(getColorShade(3))
println(getColorShade(65))

/* Output:
BLUE
UNKNOWN COLOR: white
light
dark
unknown
*/
