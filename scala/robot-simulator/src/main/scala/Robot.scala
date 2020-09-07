sealed trait Bearing
object Bearing {
  case object North extends Bearing
  case object South extends Bearing
  case object West extends Bearing
  case object East extends Bearing
}

case class Robot(bearing: Bearing, coordinates: Tuple2[Int, Int]) {

  // Turning right or left only changes the current bearing
  def turnRight() = this.bearing match {
    case Bearing.North => copy(bearing = Bearing.East)
    case Bearing.East  => copy(bearing = Bearing.South)
    case Bearing.South => copy(bearing = Bearing.West)
    case Bearing.West  => copy(bearing = Bearing.North)
  }

  def turnLeft() = this.bearing match {
    case Bearing.North => copy(bearing = Bearing.West)
    case Bearing.West  => copy(bearing = Bearing.South)
    case Bearing.South => copy(bearing = Bearing.East)
    case Bearing.East  => copy(bearing = Bearing.North)
  }

  // increments coordinates
  def advance() = {
    this match {
      case Robot(Bearing.North, (x, y)) => copy(coordinates = (x, y + 1))
      case Robot(Bearing.South, (x, y)) => copy(coordinates = (x, y - 1))
      case Robot(Bearing.East, (x, y))  => copy(coordinates = (x + 1, y))
      case Robot(Bearing.West, (x, y))  => copy(coordinates = (x - 1, y))
    }
  }

  def simulate(instructions: String) = {
    instructions.foldLeft(this) {
      case (currentRobot, 'L') => currentRobot.turnLeft()
      case (currentRobot, 'R') => currentRobot.turnRight()
      case (currentRobot, 'A') => currentRobot.advance()
      case (currentRobot, _)   => currentRobot
    }
  }
}
