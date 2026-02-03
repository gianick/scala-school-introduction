/**
 * Options
 */

case class User(id: Int, name: String)

def findUser(id: Int): Option[User] = {
  if (id == 1)
    Some(User(1, "Nikolas"))
  else
    None
}

// Pattern matching on the result
findUser(1) match {
  case Some(user) => println(user.name)
  case None       => println("Not found")
}