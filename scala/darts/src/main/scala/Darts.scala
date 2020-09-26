import scala.math.pow
import scala.math.sqrt
import scala.math.hypot

object Darts {
  def score(x: Double, y: Double): Int = hypot(x, y) match {
    case i if i <= 1  => 10
    case i if i <= 5  => 5
    case i if i <= 10 => 1
    case _            => 0
  }
}
