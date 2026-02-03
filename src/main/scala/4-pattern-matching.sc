/**
 * Pattern matching
 *
 * https://scastie.scala-lang.org/5tVq5xI6SimBHyceidSIQg
 */

def dayType(day: String): String = day match {
  case "Friday" => "Almost weekend!"
  case "Saturday" | "Sunday" => "Weekend!"
  case _ => "Regular day"
}

def describe(age: Int): String = age match {
  case a if a < 13 => "Child"
  case a if a < 20 => "Teenager"
  case _ => "Adult"
}

def handleValue(value: Any): String = value match {
  case s: String => s"Text: $s"
  case i: Int => s"Number: $i"
  case _ => "Unknown"
}

def describeUser(pair: (String, Int)): String = pair match {
  case ("admin", _) => "Admin user"
  case (name, score) if score >= 100 => s"$name: Perfect score!"
  case (name, score) => s"$name scored $score"
}

// ---

dayType("Monday")
dayType("Sunday")

dayType("0")

// ---

describe(27)

describe(7)

// How can we fix this?
describe(-1)

handleValue(1)
handleValue("hello")

describeUser(("John", 5))
describeUser(("admin", 5))

