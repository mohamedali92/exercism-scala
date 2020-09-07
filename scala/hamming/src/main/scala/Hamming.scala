object Hamming {
  :type (true)
  def distance(str: String, str1: String): Option[Int] = {
    if (str.length != str1.length) None
    else {
      var differences = 0
      var i = 0
      while (i < str.length) {
        if (str(i) != str1(i)) {
          differences += 1
        }
        i += 1
      }
      Some(differences)
    }
  }
}
