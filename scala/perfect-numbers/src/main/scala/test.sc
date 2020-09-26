def sumFactors(input: Int) = {
  (1 until input).filter(input % _ == 0).sum
}

sumFactors(12)