object Sieve {
  def primes(upTo: Int): List[Int] = {
    def _primes(inputList: List[Int]): List[Int] = inputList.headOption match {
      case None       => inputList
      case Some(head) => head :: _primes(inputList.tail.filter(_ % head != 0))
    }

    _primes((2 to upTo).toList)
  }
}
