package com.dsm.intro

/**
  * Created on 11-11-2019.
  */
object ConditionalExpression {
  def main(args: Array[String]): Unit = {
    val age = 23
    if (age < 18) {
      println("child")
    } else if(age >= 18 && age < 65) {
      println("adult")
    } else {
      println("old")
    }
  }
}
