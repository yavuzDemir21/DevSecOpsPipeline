object Deduplicator extends App {

  println(deduplicate(Array("1", "2", "3", "2")).mkString("Array(", ", ", ")"))

  def deduplicate(myArgs: Array[String]): Array[String] = {
    myArgs.toSet.toArray
  }

}
