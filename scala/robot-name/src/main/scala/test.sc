import collection.mutable

object Robot {
  val namesGeneratedAlready = mutable.HashSet.empty[String]
}

class Robot {
  import Robot.namesGeneratedAlready
  val upperChars = ('A' to 'Z').toArray
  val nums = ('0' to '9').toArray
  val r = scala.util.Random
  val spec = List(upperChars, upperChars, nums, nums, nums)
  var name = createNewName()

//  def generateRandomName():String = s"${upperChars(r.nextInt(26))}${upperChars(r.nextInt(26))}${r.nextInt(10).toString}${r.nextInt(10).toString}${r.nextInt(10).toString}"

  def generateRandomName(): String = {
    spec.map({
      x => x(r.nextInt(x.length))
    }).mkString
  }

  def createNewName(): String = {
    var tempName = generateRandomName()
    while (namesGeneratedAlready.contains(tempName)) tempName = generateRandomName()
    namesGeneratedAlready += tempName
    tempName

  }
  def reset() = name = createNewName()
}

val robot = new Robot
robot.generateRandomName()

val x = Array.fill(5)(5)