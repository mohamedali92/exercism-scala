val nums = 2 to 10

def primes(upTo: Int) = {
  val numIterations = math.sqrt(upTo).toInt + 1
  var nums = (2 to upTo).toList
  var curr = 0
  var i = 0

  while (i < numIterations) {
    val currentPrime = nums(i)
    val factorsForCurrentPrime = List.tabulate(upTo)(n => (currentPrime * currentPrime) + (n * currentPrime)).filter(_ <= upTo)
    println(s"factors of $currentPrime: are $factorsForCurrentPrime")
    //    nums = nums.filterNot(factorsForCurrentPrime.contains(_))
    ////    println(s"New nums: $nums")
    //    i += 1
    ////    println("----- End of iteration ----- ")
    //  }
    //
    //  nums

  }
}


def generateMultiples(num: Int, limit: Int) = {
  List.tabulate(limit)(n => (num * num) + (n * num))
}
// generateMultiples(2, 1000)

primes(1000)