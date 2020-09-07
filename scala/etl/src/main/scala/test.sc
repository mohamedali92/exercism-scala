import scala.language.postfixOps

val input = Map(1 -> Seq("A", "E", "I", "O", "U"),
  2 -> Seq("D", "G"))

def transform(input: Map[Int, Seq[String]]) = {
  input map {
    case (score, letters) => letters map (letter => letter.toLowerCase -> score)
  } flatten
}


transform(input) toMap