// For.scala

for(i <- 0 until 10) {
  print(i + " ")
}
println()

for(i <- 0 until 20 by 2) {
  print(i + " ")
}
println()

for(i <- Range(0, 10)) {
  print(i + " ")
}
println()

for(i <- Range(0, 20, 2)) {
  print(i + " ")
}
println()

/* Output:
0 1 2 3 4 5 6 7 8 9 
0 2 4 6 8 10 12 14 16 18 
0 1 2 3 4 5 6 7 8 9 
0 2 4 6 8 10 12 14 16 18
*/
