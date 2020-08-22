package com.dsm.test

object implicitfunctions {
  def main(args: Array[String]): Unit = {
    implicit val myName = "Implicit Name"
    implicit val myAge:Int = 24
    implicit val number:BigInt = 1234567890
    // Calling a higher order function with implicit parameter list
    implicit def provideYourAgeAgain1(): Int = {
      100
    }

    // Implicit parameter list with INT
    def sayHelloImplicitlyInt(Name: String)(implicit whoAreYou1: () => Int, ImplicitName: String, number: BigInt ): String = {
      s"My normal parm Name is $Name and My Implicit fn age is ${whoAreYou1()}! My name is Implicit parm $ImplicitName, I know numbers till $number"
    }
    println(sayHelloImplicitlyInt("Saikumar"))

  }
}
