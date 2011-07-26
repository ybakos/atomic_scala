case class Color (red: Int, green: Int, blue: Int) {
  val colorString = "0123456789ABCDEF"
  def toHex(decimal : Int): String = {
    val position1 = (decimal-decimal%16)/16
    val position2 = decimal%16
    colorString(position1).toString + colorString(position2).toString
  }
  def convertToHex() : String = {
    toHex(red) + toHex(green) + toHex(blue)
  }

  def percentRed= (red/255.0 * 100).toInt
  def percentBlue = (blue/255.0 * 100).toInt
  def percentGreen = (green/255.0 * 100).toInt

  def displayColors = {
    println("Red   " + "x" * percentRed)
    println("Green " + "x" * percentGreen)
    println("Blue  " + "x" * percentBlue)
  }
}
