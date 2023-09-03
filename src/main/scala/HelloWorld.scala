import scala.collection.mutable.ListBuffer

def double(ints :List[Int]): List[Int] =
  var buffer = new ListBuffer[Int]()
  for i <- ints do
    buffer += i*2
  buffer.toList

var oldNumbers = List(1, 2, 3)
val newNumbers = double(oldNumbers)

@main def test() =
  println(newNumbers)