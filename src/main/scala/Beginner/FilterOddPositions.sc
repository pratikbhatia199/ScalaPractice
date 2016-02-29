val x: Array[String] = Array("0", "1", "2", "3", "4", "5")
(x zipWithIndex ) filter (_._2 % 2 == 0) map (_._1)

class FilterOddPositions {
  def f(arr: List[Int]): List[Int] = {
    (arr zipWithIndex) filter (_._2 % 2 == 0) map (_._1)
  }
}

object Solution {
  def f(arr: List[Int]): List[Int] = {
    (arr zipWithIndex) filter (_._2 % 2 == 0) map (_._1)
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    println(args.mkString("\n"))
    new FilterOddPositions.f(args.map(_.toInt).toList).mkString("\n")
    println(x)

  }
}


Solution.main(Array("0", "1", "2", "3", "4", "5"))


