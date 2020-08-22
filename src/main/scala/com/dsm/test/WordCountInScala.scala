package com.dsm.test

object WordCountInScala {

  def main(args: Array[String]): Unit = {
    val linesList: List[String] = List(
      "Rahul is working on big data technologies",
      "Data is the new oil",
      "Spark is the recently used technologies"
    )

    val wordsList = linesList
      .flatMap(rec => rec.split(" "))
      .groupBy(rec => rec)
      .mapValues(list => list.size)

    wordsList.foreach(println)

    println("\n Flatmap")

    linesList.flatMap(rec => rec.split(" ")).foreach(println)

    println("groupBy")

    linesList.groupBy(rec => rec).foreach(println)




  }


}
