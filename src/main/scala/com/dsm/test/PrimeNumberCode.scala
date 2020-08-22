package com.dsm.test

object PrimeNumberCode {
  def main(args: Array[String]): Unit = {
    var Counter = 1
    for(i <- 2 to 1000){
      if(isPrime(i)){
        Counter = Counter + 1
      }
    }
    println(s"Number of prime number between 1 to 1000 is $Counter")
  }


  def isPrime(num: Int): Boolean={
    var flag = true
    for(n <- 2 to num/2 by 1){
      if(num%n == 0){
        flag = false
      }
    }
    return flag
  }





}




