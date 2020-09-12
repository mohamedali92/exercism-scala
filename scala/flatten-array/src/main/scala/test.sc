val testList = List(0,
  2,
  List(List(2, 3, null), 8, 100, 4, List(List(List(50)))),
  -2)

import scala.collection.mutable.ListBuffer
val solution  = new ListBuffer[Any]()

//def flatten(input: List[Any]): ListBuffer[Any] = {
//  input.filterNot(_ == null).foldLeft(new ListBuffer[Any]()) {
//    case (c,l: List[Any]) => flatten(l)
//    case (c,l) =>  c += l
//    case _ => null
//  }
//}


def flatten(input: List[Any]): List[Any] = {
  input.filterNot(_ == null).flatMap {
    case l: List[Any] => flatten(l)
    case i: Int => List(i)
    case _ => List()
  }
}
flatten(testList)
//
//
//val x =  List()
//
//val test = List(1,1,3,4,5,6)
//test.foldLeft(0) {
//  case (c, 5) => c + 20
//  case (c, n) => c + n
//}