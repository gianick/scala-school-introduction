import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must.Matchers

class PatternMatchingSpec extends AnyWordSpec with Matchers {

  case class Person(name: String, age: Int)

  "Pattern Matching basics" must {

    "match on simple values (Literals)" in {
      val day = "Monday"

      val result = day match {
        case "Monday" => "Start of week"
        case "Friday" => "End of week"
        case _        => "Mid week"
      }

      result mustBe "Start of week"
    }

    "match on types" in {
      val x: Any = 10.0

      val result = x match {
        case i: Int    => "It's an Int"
        case d: Double => "It's a Double"
        case _         => "Something else"
      }

      result mustBe "It's a Double"
    }

    "destructure Case Classes" in {
      val alice = Person("Alice", 25)

      val result = alice match {
        case Person("Alice", 25) => "Exact match"
        case Person(name, _)     => s"It's $name"
      }

      result mustBe "Exact match"
    }

    "match on List patterns" in {
      val fruits = List("Apple", "Banana", "Orange")

      val result = fruits match {
        case List("Apple", _, _) => "Starts with Apple, has 3 items"
        case head :: tail        => s"Head is $head"
        case Nil                 => "Empty"
      }

      result mustBe "Starts with Apple, has 3 items"
    }

    "use guards (if statements)" in {
      val age = 18

      val status = age match {
        case n if n >= 18 => "Adult"
        case _            => "Minor"
      }

      status mustBe "Adult"
    }
  }
}
