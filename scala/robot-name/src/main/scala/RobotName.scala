import collection.mutable

object Robot {
  val namesGeneratedAlready = mutable.HashSet.empty[String]
}

class Robot {
  import Robot.namesGeneratedAlready
  val upperChars = ('A' to 'Z').toArray
  val nums = ('0' to '9').toArray
  val r = scala.util.Random
  val nameRequirement = List(upperChars, upperChars, nums, nums, nums)
  var name = createNewName()

  def generateRandomName(): String = {
    nameRequirement.map({
      x => x(r.nextInt(x.nameRequirement))
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