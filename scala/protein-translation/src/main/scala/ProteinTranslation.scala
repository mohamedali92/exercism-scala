object ProteinTranslation {
  def proteins(input: String): Seq[String] = {
    input
      .grouped(3)
      .takeWhile(rna => !List("UAA", "UAG", "UGA").contains(rna))
      .map {
        _ match {
          case "AUG"                         => "Methionine"
          case "UUU" | "UUC"                 => "Phenylalanine"
          case "UUA" | "UUG"                 => "Leucine"
          case "UCU" | "UCC" | "UCA" | "UCG" => "Serine"
          case "UAU" | "UAC"                 => "Tyrosine"
          case "UGU" | "UGC"                 => "Cysteine"
          case "UGG"                         => "Tryptophan"
        }
      }
      .toSeq
  }
}
