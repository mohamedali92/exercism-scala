object Isogram {

  def isIsogram(input: String): Boolean = {
    val cleanedInput = input.filter(_.isLetter).toLowerCase
    cleanedInput.toSet.size == cleanedInput.size
  }

}
