/**
 * Mixing traits
 */

trait CanFly {
  def fly(): String = "Flying!"
}

trait CanSwim {
  def swim(): String = "Swimming!"
}

case class Duck(name: String) extends CanFly, CanSwim


// ---

val myDuck = Duck("Donald")

myDuck.fly()

myDuck.swim()