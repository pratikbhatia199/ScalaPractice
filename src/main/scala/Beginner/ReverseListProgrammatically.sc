def f(arr:List[Int]):List[Int] = {
  var listReversed = List.empty[Int]
  arr foreach (x =>
    listReversed = x :: listReversed
    )
  listReversed
}

def f2(arr:List[Int]):List[Int] = arr match {
  case odd::Nil => Nil
  case odd::even::Nil => even::Nil
  case odd::even::tail => even::f(tail)
}

def f3(arr:List[Int]):List[Int] = {
  arr match {
    case Nil => arr
    case (x::xs) => f(xs) ::: List(x)
  }
}
f(List(1,2,3,4))

List(1,2, 3, 4) match {
  case Nil => println(Nil)
  case (x::xs) =>
    println(x)
    println(xs)
    println("Here")
}

val x = List(1,2, 3, 4)
for (
  v <-x
  ) yield {v * 2}
