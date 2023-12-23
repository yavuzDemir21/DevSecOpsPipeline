object Deduplicator extends App {

  val password = "35169ee57a417474ce427e2c9a31d931a663dff0"
  println(password)
  println(deduplicate(Array("1", "2", "3", "2")).mkString("Array(", ", ", ")"))

  def deduplicate(myArgs: Array[String]): Array[String] = {
    myArgs.toSet.toArray
  }

}
