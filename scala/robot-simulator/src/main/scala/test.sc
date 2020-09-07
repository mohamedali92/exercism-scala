import Bearing.Bearing

case class Robot(b: Bearing, startingCoordinates: Tuple2[Int, Int]) {
  val coordinates = startingCoordinates
  val bearing: Bearing = b
  val listOfBearings = Array(Bearing.North, Bearing.East, Bearing.South, Bearing.West)
  val numOfBearings = listOfBearings.length

  // Turning right or left only changes the current bearing
  def turnRight() = {
    val indexOfCurrentBearing = listOfBearings.indexOf(this.bearing)

    val newBearing = listOfBearings((indexOfCurrentBearing + 1) % numOfBearings)
    Robot(newBearing, this.coordinates)
  }

  def turnLeft() = {
    val indexOfCurrentBearing = listOfBearings.indexOf(this.bearing)
    val newBearing = if(indexOfCurrentBearing - 1 < 0 ) listOfBearings(numOfBearings - 1) else listOfBearings(indexOfCurrentBearing - 1)
    Robot(newBearing, this.coordinates)

  }

  // increments coordinates
  def advance() = {
    this match {
      case Robot(Bearing.North, (x, y)) => copy(startingCoordinates = (x, y + 1))
      case Robot(Bearing.South, (x, y)) => copy(startingCoordinates = (x, y - 1))
      case Robot(Bearing.East, (x, y)) => copy(startingCoordinates = (x + 1, y))
      case Robot(Bearing.West, (x, y)) => copy(startingCoordinates = (x - 1, y))
    }
  }


  def simulate(instructions: String) = {
    instructions.foldLeft(copy()) {
      (A, B) => B match {
        case 'L' => A.turnLeft()
        case 'R' => A.turnRight()
        case 'A' => A.advance()
      }
    }
  }



}

object Bearing extends Enumeration {
  type Bearing = Value
  val North, South, East, West = Value

}

val testRobot = Robot(Bearing.South, (8,4)).simulate("LAAARRRALLLL")

