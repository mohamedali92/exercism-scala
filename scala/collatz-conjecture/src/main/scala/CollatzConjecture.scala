object CollatzConjecture {

  def steps(n: Int): Option[Int] = {
    calculateNumSteps(n, 0)
  }

  def calculateNumSteps(n: Int, numStep: Int): Option[Int] = {
    n match {
      case n if n <= 0 => None
      case n if n == 1 => Some(numStep)
      case n if n % 2 == 0 => calculateNumSteps(n / 2, numStep + 1)
      case n => calculateNumSteps(3 * n + 1, numStep + 1)
    }
  }
}
