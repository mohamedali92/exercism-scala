//object ScrabbleScore {
//  def score(input: String): Int = input match {
//    case "" => 0
//    case _ =>
//      input.toUpperCase map { letter =>
//        letter match {
//          case 'A' | 'E' | 'I' | 'O' | 'U' | 'L' | 'N' | 'R' | 'S' | 'T' => 1
//          case 'D' | 'G'                                                 => 2
//          case 'B' | 'C' | 'M' | 'P'                                     => 3
//          case 'F' | 'H' | 'V' | 'W' | 'Y'                               => 4
//          case 'K'                                                       => 5
//          case 'J' | 'X'                                                 => 8
//          case 'Q' | 'Z'                                                 => 10
//          case _                                                         => 0
//        }
//      } reduce (_ + _)
//  }
//}

object ScrabbleScore {
  def score(input: String): Int = input match {
    case "" => 0
    case _ =>
      input.toUpperCase map { letter =>
        letter match {
          case 'A' | 'E' | 'I' | 'O' | 'U' | 'L' | 'N' | 'R' | 'S' | 'T' => 1
          case 'D' | 'G'                                                 => 2
          case 'B' | 'C' | 'M' | 'P'                                     => 3
          case 'F' | 'H' | 'V' | 'W' | 'Y'                               => 4
          case 'K'                                                       => 5
          case 'J' | 'X'                                                 => 8
          case 'Q' | 'Z'                                                 => 10
          case _                                                         => 0
        }
      } sum
  }
}
