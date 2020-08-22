package com.dsm.intro

object TypedFunctions {

  def main(args: Array[String]): Unit = {
    discount[String]("CouponCode_1234")
    discount[Int](10)
  }

  def discount[T](discount: T) = {
    discount match{
      case d: String =>
        println(s"The type of the parameter is string")
      case d: Int =>
        println(s"The type of the parameter is Int")
      case _ =>
      println(s"The parameter type is not found")
    }

  }



}
