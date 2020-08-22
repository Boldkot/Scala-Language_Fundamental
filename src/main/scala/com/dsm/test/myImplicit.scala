package com.dsm.test

object myImplicit {

  def main(args: Array[String]): Unit = {
    implicit val age = 25
    implicit def company(): String = {
      "Attra"
    }

    def statement(name: String)(implicit age: Int, company: () => String): String = {
      return (s"hello my name is $name , my age is $age, i work at ${company()}")
    }
     println(statement("rahul"))
    println(statement("rahul")(30,() => "Databricks"))


  }
}
