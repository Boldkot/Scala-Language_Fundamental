class GFG {
    def display() = {
      println("The object has been created")
  }

}

// Anonymous objects are the objects that are instantiated but does not contain any reference,
// you can create an anonymous object when you do not want to reuse it.

// Object

object AnonymousSingletonObject {

  def main(args: Array[String]): Unit = {
    val gfg = new GFG()
    gfg.display()
  }
}