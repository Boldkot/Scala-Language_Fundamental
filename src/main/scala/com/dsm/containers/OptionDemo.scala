package com.dsm.containers

object    OptionDemo {
  def main(args: Array[String]): Unit = {

// All about scala code

  val donut: Option[String] = Some("Glazed Donut")
  println(s"The donut is ${donut.get}")

  val donut2: Option[String] = None
  println(s"${donut2.getOrElse("The donut is Empty")}")


  val donut3: Option[String] = Some("Plain Donut")

  donut3 match {
    case Some("Plain Donut") => println(s"The plain donut is found")
    case None => println("No Donut is found")
  }



   println(s"\n")
// Code given by siddhartha
    val pi = fraction(22, 7)
    println("Pi = " + pi)
    val badValue = fraction(22, 0)
    println("Divide by 0 = " + badValue)

    val piAgain = fraction(22, 7) getOrElse "Oops, something went wrong!"
    println("\nPi with 'getOrElse' = " + piAgain)
    val badValueAgain = fraction(22, 0) getOrElse "Oops, something went wrong!"
    println("Divide by 0 with 'getOrElse' = " + badValueAgain)

    println("\nPattern matching with Option,")
    fraction(22, 7) match {
      case Some(pi) => println("Pi = " + pi)
      case None => println("Oops, something went wrong!")
    }

  }

  // Option[Double] is a type safe way to signal if something went wrong/missing and it can be a way for error handling
  def fraction(numerator: Double, denominator: Double): Option[Double] = {
    if(denominator == 0)
      None
    else
      Some(numerator/denominator)
  }
}
