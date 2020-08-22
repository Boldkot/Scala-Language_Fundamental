package com.dsm.test

object CounterDoubt {
  def main(args: Array[String]): Unit = {
    val CounterObj = new CounterExp
    CounterObj.inc.printfunc
    CounterObj.inc.inc.inc.printfunc
    CounterObj.inc(10).printfunc
  }

}


class CounterExp(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new CounterExp(count+1)
  }

  def dec = {
    print("Decrementing")
    new CounterExp(count-1)
  }

  def inc(n: Int): CounterExp = {
    if(n<=0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): CounterExp = {
    if(n<=0) this
    else dec.dec(n-1)
  }

  def printfunc() = print(count)
}