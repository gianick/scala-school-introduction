/**
 * Collection basics
 */


val nums: List[Int] = List(1, 4, 25, 9, 4, 21, 5, 2)

val uniqueNums: Set[Int] = Set(1, 2, 3, 4, 5)

val users: Map[Int, String] = Map(1 -> "Jane", 2 -> "John")

val tuple3A: (Int, String, Char) = (4, "Four", 'F')

val tuple3B: Tuple3[Int, String, Char] = (4, "Four", 'F')

// Collection methods

nums.map(num => num + 10)
nums.map(_ + 10)

nums.filter(num => num > 4)


nums.find(num => num > 22) // stops at first match


// Accessing elements
nums.head

nums.tail

// Taking elements
nums.take(3)

nums.takeWhile(_ < 10)

// Dropping elements
nums.drop(5)

nums.dropWhile(_ < 15)

// Reducing - aggregating
nums.reduce(_ + _)

// Removing duplicates
nums.distinct

nums.toSet

// Slicing (from until)
nums.slice(2, 5)

// Searching - predicates
nums.exists(_ > 20)

nums.contains(0)

nums.contains(1)

// Min/Max
nums.min

nums.max

// Counting

nums.count(_ % 2 == 0)

// Empty check
nums.isEmpty

// Zipping
nums.zip(List("A", "B", "C", "D"))

nums.zipWithIndex