import scala.annotation.tailrec

class Accumulate {
  def accumulate[A, B](f: (A) => B, list: List[A]): List[B] = {
    _accumulate[A, B](f, list)
  }

  private def _accumulate[A, B](f: (A) => B, list: List[A]): List[B] =
    list.headOption match {
      case None       => Nil
      case Some(head) => f(head) :: _accumulate[A, B](f, list.tail)
    }
}
