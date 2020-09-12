import scala.None

object BinarySearch {
  def find(items: List[Int], numToFind: Int): Option[Int] = {
    def binarySearch(l: Int, r: Int): Option[Int] = {
      val midpoint = (l + r) / 2
      if (l > r) None
      else if (numToFind > items(midpoint)) binarySearch(midpoint + 1, r)
      else if (numToFind < items(midpoint)) binarySearch(l, midpoint - 1)
      else Some(midpoint)
    }
    binarySearch(0, items.length - 1)
  }

}
