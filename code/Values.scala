// Values.scala
val b0b: Byte = 7        // Range: -2^7  to 2^7  -1
val small: Short = 8     // Range: -2^15 to 2^15 -1
val big_ger: Int = 11    // Range: -2^31 to 2^31 -1
val biggest: Long = 12L  // Range: -2^63 to 2^63 -1
val high: Float = 1.3f   // Must say '1.3f' or '1.3F'
val wide: Double = 1.4   // Optional '1.4d' or '1.4D'
val oneDimensional: Boolean = true // true or false
val a: Char = 'c'        // Range: 0 to 2^16 -1
val words: String = "A value"
val lines: String = """Triple quotes allow you
to have many lines
in your string"""

println(b0b, small, big_ger, biggest, high, wide,
  oneDimensional, a, words)
println(lines)

/* Output:
(7,8,11,12,1.3,1.4,true,c,A value)
Triple quotes allow you
to have many lines
in your string
*/
