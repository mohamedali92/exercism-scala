object Bob {
  def response(statement: String): String = {
    val trimmedStatement = statement.trim

    if (trimmedStatement == "") "Fine. Be that way!"
    else if (isQuestion(trimmedStatement) && isShouting(trimmedStatement)) "Calm down, I know what I'm doing!"
    else if (isQuestion(trimmedStatement)) "Sure."
    else if (isShouting(trimmedStatement)) "Whoa, chill out!"
    else "Whatever."
  }

  def isQuestion(statement: String): Boolean = statement.endsWith("?")

  def isShouting(statement: String): Boolean = statement.toUpperCase == statement && !isLetterLess(statement)

  def isLetterLess(statement: String): Boolean = statement.matches("[\\W\\d]*")
}
