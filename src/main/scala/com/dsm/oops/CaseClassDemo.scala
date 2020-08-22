package  com.dsm.oops

// code to understand equals and pattern matching in case class - https://github.com/cloudxlab/bigdata/blob/master/scala/case_classes/

object CaseClassDemo {

  def main(args: Array[String]): Unit = {
    val me = Person("Sidhartha", "Ray")             // No 'new' keyword here
    println(me)                                     // but we haven't implemented it's toString() function

    val dsm = BigDataInstitute("Data Science Monks", "Bangalore", "Spark with Scala & AWS")
    println(getInstituteDetails(dsm))
  }

  def getInstituteDetails[T <: Institute] (inst: T): String = inst match {
    case BigDataInstitute(name: String, location: String, program: String) => s"Institute($name,$location,$program)"
    case inst: Institute => {inst.getDetails()}
  }
}

// Implements equality (hashCode & equals), toString along with Serializable
case class Person(firstName: String, lastName: String) {
}

abstract class Institute (name: String, location: String) {
  def getDetails(): String = {
    s"Institute($name,$location)"
  }
  def runProgram()
}

case class BigDataInstitute(name: String, location: String, program: String) extends Institute(name: String, location: String) {
  override def runProgram(): Unit = {
    println("Run Apache Spark with Scala and AWS program")
  }
}

