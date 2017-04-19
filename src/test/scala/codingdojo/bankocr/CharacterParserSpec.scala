package codingdojo.bankocr

import org.scalatest.{Matchers, WordSpec}

class CharacterParserSpec extends WordSpec with Matchers {

  val parser = new CharacterParser

  "The character parser" should {

    "return None, if no input was given" in {

      parser.parseString("") shouldBe None

    }

  }

}
