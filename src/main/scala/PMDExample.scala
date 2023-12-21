object PMDExample {
  def main(args: Array[String]): Unit = {
    var x = 10 // This will trigger PMD's rule about using 'var' instead of 'val'

    // Unused variable, might trigger PMD's 'UnusedLocalVariable' rule
    val unusedVariable = "This variable is not used"

    // Using non-traversable Java collection (Vector) instead of Scala collection
    val javaVector = new java.util.Vector[String]()

    // Inefficient code by using 'to' method in a large range, might trigger PMD's 'AvoidLiteralsInForLoop' rule
    for (i <- 0 to 100000) {
      println(i)
    }

    // Unused import statement, might trigger PMD's 'UnusedImports' rule
    import java.util.Date

    // Empty catch block, might trigger PMD's 'EmptyCatchBlock' rule
    try {
      // code that might throw an exception
    } catch {
      case _: Exception => // empty catch block
    }
  }
}
