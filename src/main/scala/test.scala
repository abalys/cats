import JsonWriterInstances._

object test {

  def main(args: Array[String]): Unit = {
    val myJsonObject: Json = Json2.toJson(Person("john","john_smith@gmail.com"))
    println(myJsonObject)
  }
}
