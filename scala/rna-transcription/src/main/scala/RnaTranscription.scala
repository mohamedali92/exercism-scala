object RnaTranscription {
  def toRna(DNAstrand: String): Option[String] = {
    Some(DNAstrand.map {
      case 'G' => 'C'
      case 'C' => 'G'
      case 'T' => 'A'
      case 'A' => 'U'
      case _   => throw new Exception("Invalid DNA Strand")
    })
  }
}
