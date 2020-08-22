package com.dsm.oops

import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla

// Apply function lets you call the

object ApplyFunctionFactoryMethodExample {

  def main(args: Array[String]): Unit = {

    val glazedDonut = Donut("Glazed Donut")
    println(s"The class of the glazed is: ${glazedDonut.getClass}")
    glazedDonut.print

    val vanillaDonut = Donut("Vanilla Donut")
    println(s"The class of the vanilla is: ${vanillaDonut.getClass}")
    vanillaDonut.print
  }
}

class Donut(name: String, productCode: Option[Long] = None){

  def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

}

class GlazedDonut(name: String) extends Donut(name)

class VanillaDonut(name: String) extends Donut(name)

object Donut {                              // Companion object of the donut class, private member are interchangebly accessible

  def apply(name: String): Donut = {        // Here the apply is used as a factory method
    name match {
      case "Glazed Donut" => new GlazedDonut(name)
      case "Vanilla Donut" => new VanillaDonut(name)
      case _ => new Donut(name)
    }
  }

}




// Apply function can be used as a clever class builder

//abstract class DatabaseDriver {
//  // some database stuff
//}
//
//object DatabaseDriver {
//  def apply(config: Configuration) = config.dbType match {
//    case "MYSQL" => new MySqlDriver()
//    case "PSQL" => new PostgresDriver()
//    case _ => new GenericDriver()
//  }
//}
//
//// now I get the right version!
//val mydatabase = DatabaseDriver(dbConfig)

