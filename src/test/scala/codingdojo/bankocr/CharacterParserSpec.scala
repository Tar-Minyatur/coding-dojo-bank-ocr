package codingdojo.bankocr

import org.scalatest.{Matchers, WordSpec}

class CharacterParserSpec extends WordSpec with Matchers {

  val parser = new CharacterParser

  "The character parser" should {

    "return None, if no input was given" in {

      parser.parseString("") shouldBe None

    }

    "recognize a perfect 0" in {

      val character = parser.parseString(
        " _ " +
        "| |" +
        "|_|"
      )
      character shouldBe Some('0')

    }

    "recognize a perfect 1" in {

      val character = parser.parseString(
        "   " +
        "  |" +
        "  |"
      )
      character shouldBe Some('1')

    }

    "recognize a perfect 2" in {

      val character = parser.parseString(
        " _ " +
        " _|" +
        "|_ "
      )
      character shouldBe Some('2')

    }

    "recognize a perfect 3" in {

      val character = parser.parseString(
        " _ " +
        " _|" +
        " _|"
      )
      character shouldBe Some('3')

    }

    "recognize a perfect 4" in {

      val character = parser.parseString(
        "   " +
        "|_|" +
        "  |"
      )
      character shouldBe Some('4')

    }

    "recognize a perfect 5" in {

      val character = parser.parseString(
        " _ " +
        "|_ " +
        " _|"
      )
      character shouldBe Some('5')

    }

    "recognize a perfect 6" in {

      val character = parser.parseString(
        " _ " +
        "|_ " +
        "|_|"
      )
      character shouldBe Some('6')

    }

    "recognize a perfect 7" in {

      val character = parser.parseString(
        " _ " +
        "  |" +
        "  |"
      )
      character shouldBe Some('7')

    }

    "recognize a perfect 8" in {

      val character = parser.parseString(
        " _ " +
        "|_|" +
        "|_|"
      )
      character shouldBe Some('8')

    }

    "recognize a perfect 9" in {

      val character = parser.parseString(
        " _ " +
        "|_|" +
        " _|"
      )
      character shouldBe Some('9')

    }

  }

}
