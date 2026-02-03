import java.util.UUID

class User(
  name: String,
  email: String,
  age: Int,
  id: UUID = UUID.randomUUID()
) {
  def isValid(user: User): Boolean =
    name.nonEmpty && email.nonEmpty && age > 0
}

// ---

val admin = new User("Nikolas", "nikolas@example.com", 99)
