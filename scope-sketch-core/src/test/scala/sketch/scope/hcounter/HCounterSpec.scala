package sketch.scope.hcounter

import org.scalacheck.{Arbitrary, Gen}
import org.specs2.mutable._
import org.specs2.ScalaCheck
import sketch.scope.counter.CounterGen

/**
  * Licensed by Probe Technology, Inc.
  */
class HCounterSpec extends Specification with ScalaCheck {

  "HCounter" should {

    "ops" in {

      "update" in {

        "basic" in {
          todo
        }

        "irregular index" in todo

      }

      "get" in {

        "basic" in todo

        "irregular index" in todo

      }

    }

  }

}

object HCounterGen {

  def hcounterGen: Gen[HCounter] = for {
    depth <- Gen.choose(1, 10)
    width <- Gen.choose(100, 10000)
    seed = 0
  } yield HCounter.empty(depth, width, seed)

  def hcounterA: Arbitrary[HCounter] = Arbitrary(hcounterGen)

}