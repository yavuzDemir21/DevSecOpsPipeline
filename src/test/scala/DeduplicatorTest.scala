import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._

class DeduplicatorTest extends AnyFunSuite {

  test("Deduplicate given list") {

    val result   = Deduplicator.deduplicate(Array("arg1", "arg2", "arg1", "arg3"))
    val expected = Array("arg2", "arg3")

    result should contain theSameElementsAs expected

  }

}
