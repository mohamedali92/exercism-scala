sealed trait NumberType
object NumberType {
  case object Perfect extends NumberType
  case object Abundant extends NumberType
  case object Deficient extends NumberType
}

object PerfectNumbers {
  def classify(input: Int): Either[String, NumberType] = input match {
    case i if i <= 0 =>
      Left("Classification is only possible for natural numbers.")
    case _ =>
      (1 until input).filter(input % _ == 0).sum match {
        case i if i == input => Right(NumberType.Perfect)
        case i if i > input  => Right(NumberType.Abundant)
        case i if i < input  => Right(NumberType.Deficient)
      }
  }

}
