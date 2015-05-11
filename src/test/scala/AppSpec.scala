package nl.rdj

import org.scalatest.{FlatSpec, Matchers}

class AppSpec extends FlatSpec with Matchers {

  "List(1,2,3)" should "have length 3" in {
    App.listLength(List(1,2,3)) shouldBe 3
  }

}
