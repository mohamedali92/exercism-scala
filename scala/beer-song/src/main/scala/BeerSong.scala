object BeerSong {
  def recite(startingNumberOfBottles: Int, numberOfDrops: Int) = {
    startingNumberOfBottles
      .until(startingNumberOfBottles - numberOfDrops, -1)
      .map {
        _ match {
          case 0 =>
            "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
          case 1 =>
            "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
          case 2 =>
            "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
          case bottleNum =>
            s"$bottleNum bottles of beer on the wall, $bottleNum bottles of beer.\nTake one down and pass it around, ${bottleNum - 1} bottles of beer on the wall.\n"
        }
      }
      .mkString("\n")
  }
}
