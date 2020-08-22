package com.dsm.intro
import scala.annotation.tailrec

object RecursiveFunction {

  def main(args: Array[String]): Unit = {

    println(s"The greatest common divisor between 1701 and 3768 is: ${gcd(1701,3768)}")
    println(s"The factorial of the number 3 is: ${factorial(3)}")
    println(s"The tail recursive GCD of two number 1701 and 3768 is: ${TailRecursiveGCD(1701,3768)}")
    println(s"The factorial of the number 3 is: ${factorialRecursion(10)}")
    println(s"The Sum of the first 3 integers is: ${IntegerSum(10)}")
    println(s"The Recursive Sum of the first 3 integers is: ${RecursiveIntegerSum(10)}")

  }

// Below euclidean algorithm is used for find the greatest common divisor between two numbers
// As you can see if condition always the has the exit strategy

  def gcd(a: Int, b: Int): Int = {
    if(b == 0)
      a
    else
      gcd(b, a%b)
  }

// Below all the recursive calls will be made and the expression is evaluated at the end
  def factorial(n: Int): Int = {
    if(n == 0 || n == 1)
      1
    else
      n * factorial(n-1)

  }


// GCD recursive function
    def TailRecursiveGCD(x: Int, y: Int): Int = {

      @tailrec def gcd(a: Int, b: Int): Int = {
        if(b == 0)
          a
        else
          gcd(b, a %b)
      }
      gcd(x, y)
    }

// Factorial of the number with tail recursion

   def factorialRecursion(n: Int): Int = {
     @tailrec def factorialAcc(acc: Int, x: Int): Int = {
      if(x == 1)
        acc
      else
        factorialAcc(acc * x, x-1)
    }
    factorialAcc(1,n)
  }


// Sum of the first N integers
  def IntegerSum(x: Int): Int = {
    if(x == 1)
      x
    else
      x + IntegerSum(x-1)

  }

// Recursive Sum of the first N integers, here the expression is evaluated at each function call
 // Source - https://stackoverflow.com/questions/33923/what-is-tail-recursion

  // Integer Sum using tail recursion function

  def RecursiveIntegerSum(n: Int): Int = {
    @tailrec def SumAcc(x: Int, acc: Int = 1): Int = {
      if(x == 1)
        acc
      else
        SumAcc(x - 1, acc + x)
    }
    SumAcc(n)
  }

}
