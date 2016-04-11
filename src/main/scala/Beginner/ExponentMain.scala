package Beginner

import scala.io.Source
import scala.math.pow

/**
 * Created by pbhatia on 4/10/16.
 */
object ExponentMain extends App {
  override def main(args: Array[String]) {
    println("Hello, world!")
    args.foreach(arg => println(arg))
    //val input = Source.fromInputStream(System.in)
    Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).foreach(line => println("read " +  f(line.toFloat)))
  }

  def factorial(n: Float): Float = {
    if (n == 0)
      return 1.toFloat
    else
      return (n * factorial(n-1)).toFloat
  }

  def f(x: Float):Float = {
    // Compute and Return the value of e^x
    var num = 1
    var sum = 1.0
    while (num <=9) {
      sum += pow(x,num)/factorial(num.toFloat)
      num += 1
    }
    sum.toFloat
  }

}
