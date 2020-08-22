package com.dsm.oops

// Scala program of extending a class

// Base class
class Bicycle (val gearVal:Int, val speedVal: Int)
{
  // the Bicycle class has two fields
  var gear: Int = gearVal
  var speed: Int = speedVal

  // the Bicycle class has two methods
  def applyBreak(decrement: Int)
  {
    gear = gear - decrement
    println("new gear value: " + gear);
  }
  def speedUp(increment: Int)
  {
    speed = speed + increment;
    println("new speed value: " + speed);
  }
}

// Derived class
class MountainBike(override val gearVal: Int,
                   override val speedVal: Int,
                   val startHeightVal : Int)
  extends Bicycle(gearVal, speedVal)
{
  // the MountainBike subclass adds one more field
  var startHeight: Int = startHeightVal

  // the MountainBike subclass adds one more method
  def addHeight(newVal: Int)
  {
    startHeight = startHeight + newVal
    println("new startHeight : " + startHeight);
  }
}

// Creating object
object ClassExtension
{
  // Main method
  def main(args: Array[String])
  {
    val bike = new MountainBike(10, 20, 15);

    bike.addHeight(10);
    bike.speedUp(5);
    bike.applyBreak(5);
  }
}
