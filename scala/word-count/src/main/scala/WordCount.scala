case class WordCount(words: String) {
  def countWords() = {
    words.trim.toLowerCase
      .replaceAll("[^\\w']|(?<=(^|\\s))'|'(?=($|\\s))", " ")
      .split("\\s+")
      .groupBy(identity)
      .mapValues(_.length)
  }
}
