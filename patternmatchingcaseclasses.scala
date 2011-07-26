import com.atomicscala.AtomicTest._

case class Color(hue: Int)
case class Part(id: String)
case class Location(x: Int, y: Int)

def detectAndUnpack(thing: Any): String = {
	thing match {
		case Color(hue) => "Color " + hue
		case p: Part => "Part " + p
		case loc: Location => loc + " " + loc.x + ", " + loc.y
		case x => "Sumpin else " + x
	}
}

detectAndUnpack(Color(33)) is "Color 33"
detectAndUnpack(Part("Widget")) is "Part Part(Widget)"
detectAndUnpack(Location(1, 3)) is "Location(1,3) 1, 3"
detectAndUnpack(3.14) is "Sumpin else 3.14"
