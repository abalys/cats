import JsonWriterInstances._
import PrintableInstances._


object test {
  def main(args: Array[String]): Unit = {
    val str: String = "this is my string"
    val number: Int = 24

    Printable.print(str)
    Printable.print(number)


  }
}
