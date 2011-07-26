
case class Color(rgb: Int)

val BLACK = Color(0)

// seems like this should be a case object
case object Screen(width: Int = 100, height: Int = 100) {
  case class Cell(var color: Color = BLACK)
  val grid = Vector.fill(height, width) { new Cell }
  def set(x:Int, y:Int, newColor: Color) {
    println("cell " + x + ", " + y + " set to " + newColor)
    grid(x)(y).color = newColor
  }
}

val screen = Screen()

case class Splotcher(color: Color, screen: Screen) {
  val random = new scala.util.Random()
  def splotch() {
    // create random x, y,
    val x = random.nextInt(screen.width); val y = random.nextInt(screen.height)
    screen.set(x, y, color)
  }
}

/*
 val splotchers = Vector.fill(10) { Splotcher(BLACK, screen) }  // Use random gen for colors
 for(i <- 0 to 50) {
 for(s <- splotchers) {
 s.splotch()
 }
 } */

import scala.actors._

class SplotcherActor(color: Color, screen: Screen) extends Splotcher(color, screen) with Actor {

  this ! "SPLOTCH"
  start()

  def act() {
    loop {
      react {
	case "EXIT" => println("Exiting"); exit()
        case "SPLOTCH" => {
	  splotch()
	  Thread.sleep(1000)
	  this ! "SPLOTCH"  // Message to ourself: keep going
	}
      }
    }
  }
}

object SplotcherActor { // Since we couldn't use a case class
  def apply(color: Color, screen: Screen) = new SplotcherActor(color, screen)
}

val splotchers2 = Vector.fill(10) { SplotcherActor(BLACK, screen) }

println("Press RETURN to quit")
readLine
for(s <- splotchers2) {
  s ! "EXIT"
}

