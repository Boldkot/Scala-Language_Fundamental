package com.dsm.oops

// Scala program to call a method
// on a superclass in Scala

/* Super class Person */
class Persons
{
  def message()
  {
    println("This is persons class");
  }

}

/* Subclass Student */
class Students extends Persons
{

  override def message()
  {
    println("This is students class")
  }

  // Note that display() is only in Student class
  def display()
  {
    // will invoke or call current class message() method
    message ()

    // will invoke or call parent class message() method
    super.message
  }
}

/* Creating object */
object Geeks
{
  // Main method
  def main(args: Array[String])
  {
    var s = new Students();

    // Calling display() of Student
    s.display();
  }
}