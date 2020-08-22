package com.dsm.oops

/**
  * Created by sidhartha.ray on 05-11-2017.
  */
object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    val empSidharth = new Employee(101, "Sidhartha")    // Passing values to constructor
    println(empSidharth)                                            // prints some hash representation of the object, not readable
    empSidharth.showEmployeeDetails()                               // Calling a function by using an object
   // empSidharth.id                                                // Can't access the private member of a class

    val empSachin = new Employee(102, "Sachin")
    empSachin.showEmployeeDetails()

    var bigDataEmployee101 = new BigDataEmployee (101, 3000000)
    println("BigDataEmployee101's id = " + bigDataEmployee101.id)   // Can access val member of the class
//    bigDataEmployee101.id = 10                                      // but can't modify the val member of the class
    bigDataEmployee101.salary = 3500000
    println(bigDataEmployee101)             // no more hash representation of the object, internally toString() method has been called

    var bigDataEmployee102 = new BigDataEmployee(102, "Sachin", 3500000)
    println(bigDataEmployee102)
  }
}


class Employee (id: Int, name: String) {              // Class takes parameters as well and parameters are by default private vals
  def showEmployeeDetails(): Unit = {                 // Class body is the default constructor
    println(s"Employee($id,$name)")
  }
}

//If the parameters in the constructor parameter-list are declared using var,
// then the value of the fields may change. And Scala also generates getter and setter methods for that field.

//If the parameters in the constructor parameter-list are declared using val,
// then the value of the fields cannot change. And Scala also generates a getter method for that field.

//If the parameters in the constructor parameter-list are declared without using val or var,
// then the visibility of the field is very restricted. And Scala does not generate any getter and setter methods for that field.

//If the parameters in the constructor parameter-list are declared using private val or var,
// then it prevents from generating any getter and setter methods for that field. So, these fields can be accessed by the members of that class.


// Below is how we define a private constructor, a class can have only one primary constructor and many auxiallary constructors

//class BigDataEmployee private(val id: Int, var salary: Int)

class BigDataEmployee(val id: Int, var salary: Int) {  // Class parameters can also be prefixed with var or val
  var name:String = null

  def this(id: Int, name1: String, salary: Int) { // It is an auxillary constructor
    this(id, salary)
    name = name1                                  // or it can be defined as this.name = name
  }

  override def toString: String = {
    s"BigDataEmployee($id,$name,$salary)"
  }
}

