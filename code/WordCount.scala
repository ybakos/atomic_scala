// WordCount.scala (Run as script)
// For Bruce's Artima article

for(file <- args) {
  print(file + ": ")
  val contents = io.Source.fromFile(file).getLines.mkString
  println(contents.split(" ").length)
}
