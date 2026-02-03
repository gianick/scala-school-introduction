/**
 * Control Structures
 *
 * https://scastie.scala-lang.org/iOFxFmiOQWqWGoRJPHA7FA
 */

// Control structures

def grade(score: Int): String = if (score >= 90) "A" else "B"

grade(1)

grade(99)

// ----


for (i <- 1 to 5) {
  println(s"Index $i")
}



for (i <- 1 until 5) {
  println("Index: " + i)
}

// ---

val numbers: List[Int] = List(1, 2, 3, 4, 5)
for (n <- numbers if n > 2) yield n * 10
