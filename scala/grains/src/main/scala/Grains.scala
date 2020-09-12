object Grains {
  def square(numberOfSquare: Int): Option[BigInt] = numberOfSquare match {
    case x if (x <= 0 || x > 64) => None
    case 1                       => Some(1)
    case _                       => Some(BigInt(2).pow(numberOfSquare - 1))
  }

  def total() = {
    1.to(64).flatMap(square).sum
  }
}
