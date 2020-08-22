package com.dsm.oops

// from geeksForGeeks - Stateful objects in scala

class waterbottle
{
  // creating states
  var water: Int = 0
  def drinkwater = {
    if(water > 0)
    {
      water = water-1
      println("water left = "+water)
    }
    else
    {
      println("waterbottle empty fill water")
    }
  }

  // Defining method
  def fillwater (c: Int)=
  {
    if(water + c > 5)
    {
      water = 5
    }
    else
    {
      water = water + c
    }
  }
  override def toString= "water in bottle = " + water
}

// Creating object
object StatefulObject
{
  // Main method
  def main(args: Array[String])
  {
    // waterbottle object
    var w = new waterbottle

    // calling
    w.fillwater(3)
    println(w)

    // Changing state
    w.drinkwater
    w.drinkwater
    w.drinkwater
    w.drinkwater
  }
}
