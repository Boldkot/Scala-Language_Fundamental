package com.dsm.intro

object ArgsSum {

  def main(args: Array[String]): Unit = {

    val result = sum(1,2,3,4,5)
    println(s"The sum result of the list is: $result")

    doSomething(3, multiplyBy2)

    reduce(List(1,2,3),sum)

    def extraString(): String = {
      "Rahul"
    }

   returnSomething("Dey",extraString)

  }

  def multiplyBy2(n: Int): Int = {
    return n*2
  }

  def sum(args: Int*): Int = {
    var sum = 0
    for(num <- args)
      sum = sum + num
    return sum
  }

  def doSomething(n: Int, f: Int => Int) = {
    println(s"The total multiplication result is: ${f(n)}")
  }

  def returnSomething(n: String, f: () => String) = {
    println(s"The string value entered is: ${n} and extra value returned from the function is: ${f()} ")
  }

  def reduce(args: List[Int], f: (List[Int]) => Int) = {
    println(s"The total sum of the ${args} is: ${f(args)}")
  }

}
