object Bob {
  def response(statement: String): String = {
    val trimmedStatement = statement.trim
    val letterLessStatements = trimmedStatement.matches("[\\W\\d]*")

    if (trimmedStatement == "") "Fine. Be that way!"
    else if (trimmedStatement.toUpperCase == trimmedStatement && trimmedStatement.endsWith("?") && !letterLessStatements) "Calm down, I know what I'm doing!"
    else if (trimmedStatement.endsWith("?")) "Sure."
    else if (trimmedStatement.toUpperCase == trimmedStatement && !letterLessStatements) "Whoa, chill out!"
    else "Whatever."
  }

}
