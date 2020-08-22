package com.dsm.test

object MaxWords {

  def main(args: Array[String]): Unit = {
    val linesList: List[String] = List(
      "Rahul is working on big data technologies",
      "Data is the new oil",
      "Spark is the recently used technology"
    )

    println("The Map result is: ")

    linesList
      .map(rec => (rec, rec.split(" ").size))
      .sortBy(rec => -rec._2)
      .foreach(println(_))

    println("The flatmap result is:")
    linesList.flatMap(rec => rec.split(" ")).foreach(element => print(element))
  }
}
