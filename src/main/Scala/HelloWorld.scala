class HelloWorld {
  private val s: String = "Hello World!!"

  def sayHello(): Unit = {
    println(s)
  }
}

object myObj{
  def main (args: Array[String]) {
    val hw = new HelloWorld
    hw.sayHello()
  }
}
