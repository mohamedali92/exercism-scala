class School {
  type DB = Map[Int, Seq[String]]

  var db: DB = Map[Int, Seq[String]]()

  def add(name: String, g: Int) = { db = db + (g -> (grade(g) :+ name))}

  def grade(g: Int): Seq[String] = {
    db.getOrElse(g, Seq())
  }

  def sorted: DB = {
    db.mapValues(x => x.sorted).toSeq.sortBy(_._1).toMap
  }

}
