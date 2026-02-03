
case class User (
  id: Int,
  name: String,
  email: String,
  age: Int
)


// ---


val admin = User(1, "Nikolas", "nikolas@example.com", 99)

admin.name
admin.email

admin.copy(age = 22)