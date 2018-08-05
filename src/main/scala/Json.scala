object Json2 {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json =
    w.write(value)
}