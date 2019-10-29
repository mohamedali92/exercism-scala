object Leap {
  def leapYear(year: Int): Boolean = {
    def divisibleEvenlyBy(divisor: Int): Boolean = year % divisor == 0
    (!divisibleEvenlyBy(100) && divisibleEvenlyBy(4)) || divisibleEvenlyBy(400)
  }
}
