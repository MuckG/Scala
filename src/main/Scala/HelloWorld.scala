class HelloWorld {
  val s: String = "Hello World!!"

  def sayHello(): Unit = {
    println(s)
  }
}

class ByeWorld(giveName: String) extends HelloWorld{
  override val s: String = "I've had enough. See you later " + giveName + "!!"
}

object myObj{
  def main (args: Array[String]) {
    val hw = new HelloWorld
    hw.sayHello()

    val gw = new ByeWorld("Fred")
    gw.sayHello()
  }
}
