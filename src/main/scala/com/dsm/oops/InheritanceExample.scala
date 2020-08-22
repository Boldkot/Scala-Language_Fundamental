package com.dsm.oops

class point(xc: Int, yc: Int){

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
    println(s"The location is: location($x, $y)")
  }
}

// Here we have to same parameters names to point as it is defined in the superclass
class location(xc: Int, yc: Int, zc: Int) extends point(xc, yc){
  var z: Int = zc

  // The move method of the location class does not override anything of the point superclass
  def move(dx: Int, dy: Int, dz: Int) = {
    x = x + dx
    y = y + dy
    z = z + dz
    println(s"The location is: location($x, $y, $z)")
  }
}



object InheritanceExample {

  def main(args: Array[String]): Unit = {

    val pt = new point(10,20)

    pt.move(10,20)

    val loc = new location(10,20,30)

    loc.move(10,20,30)

  }

}
