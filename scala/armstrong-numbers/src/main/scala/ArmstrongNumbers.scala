object ArmstrongNumbers {
  def isArmstrongNumber(num: Int): Boolean = {
    val numAsStr = num.toString
    val numDigits = numAsStr.length
    numAsStr.map(x => scala.math.pow(x.asDigit, numDigits)).sum == num

  }
}
