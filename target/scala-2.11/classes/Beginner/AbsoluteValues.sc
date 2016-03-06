val x = List(-1, 2, -3, 4, 5, -6)
val y = -1
var z = List.empty[Int]
for ( y <- x) {
  z = (if (y < 0) {
    y * -1
  } else {
    y
  }):: z
}
z.reverse
