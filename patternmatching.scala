def printColor(color: String) = {
	color match {
		case "red" => println("rot")
		case "blue" => println("blau")
		case "green" => println("grun")
		case _ => println("unknown color: " + color)
	}
}

printColor("white")
printColor("blue")

def getColorShade(shade: Int) = {
	shade match {
		case 1 => "light"
		case 2 => "medium"
		case 3 => "dark"
		case _ => "unknown"
	}
}

println(getColorShade(1))
println(getColorShade(2))
println(getColorShade(65))
