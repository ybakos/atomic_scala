// PatternMatchingTuples.scala

def goldilocks1(expr: Any) = expr match {
  case ("porridge", "Papa") => "Papa said someones been eating my porridge"
  case ("porridge", "Mama") => "Mama said someones been eating my porridge"
  case ("porridge", "Baby") => "Baby said someones been eating my porridge"
  case _ => "what?"
}

println(goldilocks1("porridge", "Mama") )

// wildcarding parts of tuples

def goldilocks2(expr: Any) = expr match {
  case ("porridge", _) => "eating"
  case ("chair", "Mama Bear") => "sitting"
  case ("bed", "Baby Bear") => "sleeping"
  case _ => "what?"
}

println(goldilocks2("porridge", "Papa Bear"))
println(goldilocks2("porridge", "Reggie Bear"))
println(goldilocks2("chair", "Mama Bear"))
println(goldilocks2("chair", "Virginia Bear"))

// pattern substitution


def goldilocks3(expr: Any) = expr match {
  case ("porridge", bear) => bear + " said someone's been eating my porridge"
  case ("chair", bear) => bear + " said someone's been sitting in my chair"
  case ("bed", bear) => bear + " says someone's been sleeping in my bed"
  case _ => "what?"
}

println(goldilocks3("porridge", "Papa Bear"))
println(goldilocks3("porridge", "Mama Bear"))
println(goldilocks3("bed", "Baby Bear"))
