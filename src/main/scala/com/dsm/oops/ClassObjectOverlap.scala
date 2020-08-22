package com.dsm.oops

class outer_class
{
object inner_object
{
  val q = 0;
  def method()
  {
    for(q <- 0 to 2)
    {
      println("object inside a class example")
    }
    println()
  }
}
}

// Object inside Class
object outer_object
{
  class inner_class
  {
    val s = 0;
    def method()
    {
      for(s <- 0 to 2)
      {
        println("class inside an object example")
      }
    }
  }
}

object ClassObjectOverlap
{

  // Main method
  def main(args: Array[String])
  {

    // Object inside a class
    new outer_class().inner_object.method;

    // Class inside an object
    new outer_object.inner_class().method;
  }
}