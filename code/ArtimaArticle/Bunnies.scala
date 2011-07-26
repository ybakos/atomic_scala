// Bunnies.scala (Run as script)

case object Hop
case object Stop

case class Bunny(id: Int) extends scala.actors.Actor {
  this ! Hop // Constructor code
  start()    // ditto
  def act() {
    loop {
      react {
        case Hop => 
          print(this + " ")
          this ! Hop
          Thread.sleep(500)
        case Stop =>
          println("Stopping " + this)
          exit()
      }
    }
  }
}

val bunnies = Range(0,10).map(new Bunny(_))
println("Press RETURN to quit")
readLine
bunnies.foreach(_ ! Stop)
