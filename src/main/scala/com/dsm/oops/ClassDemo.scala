package com.dsm.oops

/**
  * Created on 07-11-2019.
  */
object ClassDemo {
  def main(args:Array[String]){

    // Creating a student with default a
    val studentWithDefaultAttrValues = new Student()
    studentWithDefaultAttrValues.showStudentDetails()

    // Setting student object attributes
    studentWithDefaultAttrValues.id = 101
    studentWithDefaultAttrValues.name = "Manjunath"
    //ob1.equals(obj2) // unequal - false
    studentWithDefaultAttrValues.showStudentDetails()
  }
}

class Student {
  var id: Int = 0          // All fields must be initialized
  var name: String = null

  def showStudentDetails(): Unit = {
    println(s"Student($id,$name)")
  }
}

