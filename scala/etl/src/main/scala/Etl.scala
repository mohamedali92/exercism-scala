object Etl {
  def transform(input: Map[Int, Seq[String]]) = {
    input flatMap {
      case (score, letters) =>
        letters map (letter => letter.toLowerCase -> score)
    }
  }
}
