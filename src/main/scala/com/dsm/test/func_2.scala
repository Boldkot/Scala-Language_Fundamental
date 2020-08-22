package com.dsm.test

object func_2 {
  def main(args: Array[String]): Unit = {
    println(sum(num2 = 20))
  }


  def sum(num: Int =10,num2: Int): Int ={
    var sum: Int = 0

      sum = num2 + num
    return sum
  }
}
