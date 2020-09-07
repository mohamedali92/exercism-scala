import collection.mutable.ListBuffer

object SecretHandshake {

  val secretHandshakeCommands =
    List("wink", "double blink", "close your eyes", "jump")

  def commands(num: Int) = {
    val numInBinary = num.toBinaryString
    val solution = numInBinary.reverse.zipWithIndex.flatMap {
      case (_, 4)       => None
      case ('1', index) => Some(secretHandshakeCommands(index))
      case _            => None
    }.toList

    if (numInBinary.length > 4 && numInBinary(0) == '1') solution.reverse
    else solution
  }
}
