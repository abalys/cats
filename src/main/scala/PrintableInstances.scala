object PrintableInstances {

  implicit val theOneForString: Printable[String] = new Printable[String] {
    override def format(value: String): String = value
  }

  implicit val theOneForInteger: Printable[Int] = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }

}
