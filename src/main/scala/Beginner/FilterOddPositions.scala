object Solution extends App {
  def f(arr: List[Int]): List[Int] = {
    (arr zipWithIndex) filter (_._2 % 2 == 0) map (_._1)
  }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))


}

