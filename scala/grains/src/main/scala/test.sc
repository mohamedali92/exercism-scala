import java.math.{MathContext, RoundingMode}

object Grains {
  def square(numberOfSquare: Int) = {
    if (numberOfSquare <= 0 || numberOfSquare > 64) None
    else Some(math.pow(2, numberOfSquare - 1))
  }

  def total() = {
    BigDecimal(1.to(64).flatMap(square(_)).sum).setScale(1024)
  }
}

Grains.total