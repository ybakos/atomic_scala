case class Flight(flightNumber: String, departs: Int, arrives: Int) {
   def duration = arrives - departs
   
}

val f1 = Flight("123", 11, 15)
val f2 = Flight("456", 17, 19)
val trip = List(f1, f2)


val totalTime = for {
    f <- trip
    serveMeal = 
}
  yield f.duration
  



