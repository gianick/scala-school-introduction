/**
 * Either
 */

def divide(a: Int, b: Int): Either[String, Int] = {
  if (b == 0)
    Left("Can't divide by zero!")
  else
    Right(a / b)
}

// ---

divide(10, 2)


divide(10, 0)
