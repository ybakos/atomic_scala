
case class Seat(var occupied: Boolean = false) {
  override def toString = if(occupied) "occupied" else "free"
}

class Vehicle(val name: String, val numberOfSeats: Int) {
  val seats = Vector.fill(numberOfSeats) { Seat() }
  def availableSeats = seats.count(x => !x.occupied)   
  override def toString = "Vehicle(" + name + ", " + seats + ")"
}

trait Gasoline
trait Electric

val hybrid = new Vehicle("Prius", 4) with Gasoline with Electric

hybrid.seats(0).occupied = true
println(hybrid)

case class HouseHold(var occupants: Int = 1) 

