class Deduplicator extends App {

  def deduplicate(myArgs: Array[String]): Array[String] = {
    myArgs.toSet.toArray
  }

}
