/**
 * Higher Order Functions
 */

val numbers = List(1, 2, 3, 6, 7)

// 1. Doubles each number
val doubled = numbers.map(x => x * 2)

// 2. Keeps numbers > 5
val filtered = numbers.filter(x => x > 5)

// 3. Sums all numbers
val total = numbers.foldLeft(0)(_ + _) // ?


// Scala 3 syntax: No curly braces needed
// : Int => Int is the return type
// (x: Int) => x * factor  the body of the function
def multiplier(factor: Int): Int => Int =
  (x: Int) => x * factor

// By providing 2 as a parameter, we create a specific function instance --> double
val double = multiplier(2)


val result = double(5)
