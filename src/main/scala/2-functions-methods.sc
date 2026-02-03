/**
 * Functions and methods
 * 
 * https://scastie.scala-lang.org/zP5McGvRSjaSYARgt0jUBA
 */


val multiply = (x: Int, y: Int) => x * y

multiply(33, 11)


((x: Int, y: Int) => x * y)


((x: Int, y: Int) => x * y)(33, 11)




// Default parameters:

def greet(name: String = "John"): String = s"Hello, $name"

greet("Maria")

greet("John")

greet(name = "Jane")

greet()