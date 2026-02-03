/**
 * For Comprehensions
 */

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.* // This provides the '.seconds' syntax

def getNumber(): Future[Int] = Future { 10 }

def double(n: Int): Future[Int] = Future { n * 2 }

val result = for {
  n <- getNumber() // Step 1: Get the number (10)
  d <- double(n)   // Step 2: Pass 10 into double()
} yield d          // Step 3: Wrap the final 20 in a new Future

val finalValue = Await.result(result, 5.seconds)

finalValue