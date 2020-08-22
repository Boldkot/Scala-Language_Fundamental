package com.dsm.containers

/**
  * Created by sidhartha.ray on 14-11-2017.
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    // Light weight containers of hetereogenous type of elements (upto 22 elements)
    val personalInfo = ("Sidhartha", "Ray", 31, "M")
    println("personalInfo size = " + personalInfo.productArity)

    // Tuple containing 2 elements are also called as pairs
    val genderPair = ("Sidhartha" -> "M")  // ("Sidhartha", 31)

    // Iterating over a tuple
    personalInfo.productIterator.foreach(i => println("Value = " + i))


    val (firstName, lastName, age, gender) = personalInfo
    println("First name = " + firstName)
    println("Last name = " + lastName)
    println("Age = " + age)
    println("Gender = " + gender)

    println(personalInfo._1)
    println(personalInfo._2)
    println(personalInfo._3)
    println(personalInfo._4)

    (printPersonGender _).tupled(genderPair)


// We have below a list containing tuples2
    val planets =
      List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
        ("Mars", 227.9), ("Jupiter", 778.3))

//Printing all the elements of the list containing tuples

    planets.foreach(element => println(element))

    println("-----Printing the above in another way -----")

    planets.foreach(println(_))



    // One very important thing to note here is that after case data should look exactly like the each element defined in collection
    planets.foreach{
      case ("Earth", distance) => println(s"The distance is between the earth and sun is ${distance} \n")
      case _ =>

    }

   val glazedDonut = Tuple3("Glazed Donut","Very Tasty",2.45)
   val nutDonut = Tuple3("nut Donut","Very Tasty",2.33)
   val plainDonut = Tuple3("Plain Donut","Very Tasty",2.85)


   val donutList = List(glazedDonut, nutDonut, plainDonut)

   val priceOfDonuts = donutList.foreach { tup => {
     tup match {
       case("Plain Donut",tasteLevel, price) => println(s"The donut is plain and the price is ${price}")
       case d if d._1 == "Glazed Donut" => println(s"The donut is ${d._1} and the price is ${d._3}")
       case _ => println("The Donut is nut")
     }
   }

   }

  }

  def printPersonGender(name: String, gender: String): Unit = {
    println(s"Name:$name M/F:$gender \n")
  }





}
