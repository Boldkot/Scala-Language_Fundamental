package com.dsm.intro

/**
  * Created on 07-11-2019.
  */
object PatternMatching {
  def main(args: Array[String]): Unit = {
    val age = "adult"
    age match {
      case "child" =>
        println("Age: Lesser than 18")
      case "adult" =>
        println("Age: Between 18 to 65")
      case _ =>
        println("Age: Greater than 65")
    }

    println("\n")

    val donutType = "Glazed Donut"

    donutType match {
      case "Donut" =>
        println(s"It is a very good donut")
      case _ =>
        println(s"The name is the best donut of the world is ${donutType} \n")
    }

    //Pattern matching and returning the result

    val filteredDonut = donutType match {
      case "Donut" => "Donut has been filtered"
      case _ => "Glazed Donut has been matched and filtered"
    }

    println(s"The result is ${filteredDonut} \n")

   val donut2 = donutType match {
      case "Glazed Donut" | "Stawberry Donut" => "Donut Match Found"
      case _ => "Donut Match not found"
    }

   println(s"${donut2} \n")

    val donut3 = donutType match {
      case donut if(donut.contains("Glazed") || donut.contains("Stawberry")) => "Donut is very tasty"
      case _ => "Donut is not tasty"
    }

    println(s"$donut3 \n")

    val rate: Any= 222

    val rateType = rate match {
      case price: Int => "Int"
      case price: String => "String"
      case price: Double => "Double"
    }
    println(s"${rateType}")




  }
}
