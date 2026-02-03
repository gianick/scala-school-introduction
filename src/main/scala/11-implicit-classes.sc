/**
 * Implicit classes - extensions (Scala 3)
 */

def minutesToSeconds(minutes: Int) = minutes * 60

implicit class IntOps(val minutes: Int) extends AnyVal {
  def toSeconds: Int = minutes * 60
}

5.toSeconds

// vs

minutesToSeconds(5)


// In Scala 3
extension (minutes: Int)
  def toSeconds: Int = minutes * 60

10.toSeconds
