/**
 * Chaining
 */

case class User(name: String, age: Int, active: Boolean)

val users = List(
  User("John", 30, true),
  User("Jane", 25, false),
  User("Jean", 35, true)
)

val result = users
  .filter(_.active)    // Keep only active users
  .filter(_.age >= 30) // Keep users aged 30 or older
  .map(_.name)         // Extract only the names
  .sorted              // Sort names alphabetically
  .reverse
  .zipWithIndex