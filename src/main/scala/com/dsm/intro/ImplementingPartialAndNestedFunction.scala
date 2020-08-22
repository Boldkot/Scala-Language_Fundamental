package com.dsm.intro

object  ImplementingPartialAndNestedFunction {

  def main(args: Array[String]): Unit = {

    println(s"Calling partial function isVeryTasty = ${isTasty("Glazed Donut")}")

    println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${DonutNestedValidationFunction("Vanilla Donut")}")

    println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${DonutNestedValidationFunction("Glazed Donut")}")





  }

  val isTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
  }

//Now we will define a nested function which performs validation, here val keyword is used for defining the functions validate and isDonutInStock

  def DonutNestedValidationFunction(donutName: String): Boolean = {

    val donutList = List[String]("Glazed Donut", "Chocolate Donut", "Plain Donut")

    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    val isDonutInStock = validate(donutName) && (donutList contains donutName)

    isDonutInStock
  }

}
