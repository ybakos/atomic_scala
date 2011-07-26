// make a class that has an Int field called height and an Int field called width that can be both retrieved and set externally

case class Table(var height: Int, var width: Int)

// make a class that has a String field called name that can be retrieved externally and a String field description that can be both updated and retrieved

case class Hooligan(val name: String, var description: String)

// modify Celsius so it is immutable
class Celsius(val temp: Double) {

	def fahrenheit(): Double = {
		temp * 9/5 + 32
	}
}