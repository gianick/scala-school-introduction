import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must.Matchers


class CollectionsSpec extends AnyWordSpec with Matchers {

  val nums: List[Int] = List(1, 4, 25, 9, 4, 21, 5, 2)

  "nums list" must {

    "have correct head and tail" in {
      nums.head mustBe 1
      nums.tail mustBe List(4, 25, 9, 4, 21, 5, 2)
    }

    "allow taking and dropping elements" in {
      nums.take(3) mustBe List(1, 4, 25)
      nums.drop(3) mustBe List(9, 4, 21, 5, 2)
    }

    "support functional operations" in {
      nums.distinct mustBe List(1, 4, 25, 9, 21, 5, 2)
      nums.find(_ > 20) mustBe Some(25)
      nums.filter(_ < 10) mustBe List(1, 4, 9, 4, 5, 2)
    }

    "return correct min, max, count, and zip info" in {
      nums.min mustBe 1
      nums.max mustBe 25
      nums.count(_ % 2 == 0) mustBe 3
      nums.zipWithIndex.last mustBe (2, 7)
    }

  }
}