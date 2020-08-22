package com.dsm.test

object PalindromeCode {

  def main(args: Array[String]): Unit = {
    var counter = 0

    for (num <- 2 to 1000) {
      if (isPalindrome(num.toString)) {
        counter = counter + 1
      }
    }

    println(s"Number of palindrome numbers between 1 to 1000 is $counter")

    def isPalindrome(number: String): Boolean = {
      var flag = false
      if ((number.reverse) == number) {
        flag = true
      }
      return flag
    }

  }
}