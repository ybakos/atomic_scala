// modify the celsius example from the last chapter to conform to the brevity and style guidelines shown in this chapter
// modify Celsius so it is immutable
class Celsius(val temp: Double) {

	def fahrenheit = temp * 9/5 + 32
}