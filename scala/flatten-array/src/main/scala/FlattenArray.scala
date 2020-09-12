object FlattenArray {
  def flatten(input: List[Any]): List[Any] = {
    input.flatMap {
      case l: List[Any] => flatten(l)
      case i: Int       => List(i)
      case _            => List()
    }
  }
}
