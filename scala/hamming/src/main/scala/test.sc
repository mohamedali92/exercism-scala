var a = "abe"
var b = "abc"

a(0) != b(0)

def distance(str: String, str1: String): Option[Int] = {
  if (str.length != str1.length) None
  else {
    var diff = 0
    var i = 0

    while (i < str.length) {
        if (str(i) == str1(i)) diff += 1
        i +=1

    }
    println(diff)
    Some(diff)
  }
}

distance(a, b)