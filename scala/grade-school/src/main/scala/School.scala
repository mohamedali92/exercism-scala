class School {
  type DB = Map[Int, Seq[String]]

  private var dbLatestState: DB = Map[Int, Seq[String]]()

  def db() = dbLatestState

  def add(name: String, g: Int): Unit = {
    if (dbLatestState.contains(g)) dbLatestState = dbLatestState.updated(g, dbLatestState(g) :+ name)
    else dbLatestState = dbLatestState + (g -> Seq(name))
  }

  def grade(g: Int): Seq[String] = {
    dbLatestState.getOrElse(g, Seq())
  }

  def sorted: DB = {
    dbLatestState.mapValues(x => x.sorted).toSeq.sortBy(_._1).toMap
  }

}
