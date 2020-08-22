package com.dsm.oops

// Scala program to illustrate how to
// create inner class
// source - https://www.geeksforgeeks.org/inner-class-in-scala/?ref=rp -- MUST READ

// Outer class
class Geek
{

  // Inner class
  class G1
  {
    var a = 0
    def method()
    {
      for(a<-0 to 3)
      {
        println("Welcome to inner class: G1");
      }
    }
  }
}
object InnerClassExample
{
  def main(args: Array[String])
  {

    // Creating object of the outer and
    // inner class Here, G1 class is
    // bounded with the object of Geek class
    val obj = new Geek();
    val o = new obj.G1;
    o.method();
  }
}