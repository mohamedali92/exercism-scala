case class Triangle(s1: Double, s2: Double, s3: Double) {
  val isTriangle = (s1 > 0) && (s2 > 0) && (s3 > 0) && (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2)
  def equilateral() = isTriangle && s1 == s2 && s2 == s3
  def scalene() = isTriangle && s1 != s2 && s2 != s3
  def isosceles() =
    isTriangle && (equilateral() || (s1 == s2) || (s2 == s3) || (s1 == s3))
}
