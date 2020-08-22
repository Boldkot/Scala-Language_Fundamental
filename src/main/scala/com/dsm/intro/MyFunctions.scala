package com.dsm.intro

object MyFunctions {
  def main(args: Array[String]): Unit = {


    val mydonut = donut()

    println(s"The favourite donut of the world is ${mydonut}")

    println(s"My least favorite donut is $leastFavoriteDonut")

    printSalesDonutReport()

    calculateDonutCost("Vanilla", 1)

    val realDonutCost = calculateDonutCost("Plain", 1)

    print(s"The real quantity is ${realDonutCost} \n")

    calculateDonutCost2("Plain Donut", 4)

    calculateDonutCost2("Vanilla Donut", 5, "Offer2020")

    calculateDonutCostWithOptionDefaultValue("Glazed Donut", 5, Some("COUPON_1234"))

    val FunctionOptionValue = calculateDonutCostWithOptionDefaultValue("Stawberry Donut", 5, None)

    println(s"The Final returned value of the function with coupon code value None is :${FunctionOptionValue}")

    val CouponWithReturnOption = dailyCouponCode()

    println(s"The coupon of the function with return option is : ${CouponWithReturnOption} \n")

    printDonutVar("Glazed Donut", "Plain Donut", "Coco Donut")

    val discountCurryNew = discountCurry("Glazed Donut")_

    discountCurryNew(20)(3)

    val finalDiscountCurry = discountCurryNew(10)(2)

    println(s"Final value of Curry function is $finalDiscountCurry")


// Defining the inner function while calling the higher order function itself
    val donutHigherOrderValue = donutHigherOrder("Higher Donut")(2){ totalCost =>
      val discount = 2
      totalCost - discount
    }

    println(s"${donutHigherOrderValue}")

// Defining the inner function of the higher order function separately
    def discountHigherOrderValueFunc(totalCost: Int): Int = {
      val discount = 2
      totalCost - discount
    }

    donutHigherOrder("Higher Order Donut")(5)(discountHigherOrderValueFunc(_))

// Defining the inner function of the higher order function using the val keyword

    val applyDiscountvalueFunction = (totalCost: Int) => {
      val discount = 5
      totalCost - discount
    }

    donutHigherOrder("Val Donut")(7)(applyDiscountvalueFunction)




  }

// -------------------------------- Functions below are out of scope of the main function---------------------------------------------


// Function with no parameter
  def donut(): String = {
    "Glazed Donut"
  }

// Function with no parenthesis

  def leastFavoriteDonut = "Plain Donut"

// Function without parameter or return type

  def printSalesDonutReport(): Unit = {
    println("The sales are very good")
  }

// Functions with parameters and return type

   def calculateDonutCost(name: String, quantity: Int): Double = {

     println(s"Calculating cost for donut ${name} for quantity: ${quantity}")

     2.50*quantity

   }

// Adding default values to function parameters

   def calculateDonutCost2(name: String, quantity: Int, couponCode: String = "No Code"): Double = {
     println(s"Calculate the cost of ${name} and its ${quantity} with coupon code ${couponCode}")
     quantity*3.5
   }

// Function with option parameters

   def calculateDonutCostWithOptionDefaultValue(name: String, quantity: Int, couponCode: Option[String] = Some("No code")): Double = {
     println(s"Calculating the total cost of ${name} with Quantity =  ${quantity} and Coupon Code = ${couponCode} ")

     couponCode match {
       case Some(coupon) =>
         val totalCost = quantity * 0.1 * 2.5
         totalCost

       case _ =>
         val totalCost = quantity
         totalCost
     }
   }

// Function with Option return type

  def dailyCouponCode(): Option[String] = {
    // look up in the database whether we could provide our customers with a coupon,
    // if no coupon then none should be returned and null pointer exception can be avoided

    val couponFromDB = "Coupon_1234"
    Option(couponFromDB).filter(element => element.nonEmpty)
  }

// Functions with variable arguments

  def printDonutVar(names: String*) = {
    println(s"Donut Report = ${names.mkString(" - ")} ")

  }

// Currying function, can be used when we have two items with different discount applying the same calculate discount function

  def discountCurry(name: String)(quantity: Int)(discount: Int): Int = {
    println(s"Calculating the total cost of $quantity $name with discount $discount")
    val totalCost = 2 * quantity
    totalCost + (totalCost * discount)
  }

// Higher Order function, now we have defined the function in the parameter in two ways in the main function above

  def donutHigherOrder(name: String)(quantity: Int)(f: Int => Int) = {
    println(s"Calculating Higher order ${quantity} ${name} Donuts")
    val totalcost = quantity * 20
    f(totalcost)
  }








}
