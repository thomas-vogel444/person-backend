import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MainTest extends AnyWordSpec with Matchers {

  "Main" should {
    "get 1 + 1 = 2" in {
      1 + 1 shouldBe 2
    }
  }
}
