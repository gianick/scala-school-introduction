/**
 * Futures
 */

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val futureResult: Future[String] = Future {
  Thread.sleep(2000) // Simulate a slow operation
  "Hello!"           // This will be available later
}

val transformed = futureResult.map(_.toUpperCase)

Thread.sleep(3000) // Wait longer than the Future's sleep

val valueNow = futureResult.value // Returns Some(Success(Hello!))

transformed.value

transformed.value.get