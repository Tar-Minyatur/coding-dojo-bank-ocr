package codingdojo.bankocr

import org.scalatest.{Matchers, WordSpec}

class AccountNumberParserSpec extends WordSpec with Matchers {

  val accountNumberParser = new AccountNumberParser(new CharacterExtractor, new CharacterParser)

  "The account number parser" should {

    "return an empty list for an empty string" in {

      val numbers = accountNumberParser.convertInputToNumbers("")

      numbers.length shouldBe 0

    }

    "parse a string with a single number" in {

      val numbers = accountNumberParser.convertInputToNumbers(
        "    _  _     _  _  _  _  _ \n" +
        "  | _| _||_||_ |_   ||_||_|\n" +
        "  ||_  _|  | _||_|  ||_| _|\n"
      )

      numbers.length shouldBe 1
      numbers.head shouldBe "123456789"

    }

    "parse a string with multiple numbers" in {

      val numbers = accountNumberParser.convertInputToNumbers(
        "    _  _     _  _  _  _  _ \n" +
        "  | _| _||_||_ |_   ||_||_|\n" +
        "  ||_  _|  | _||_|  ||_| _|\n" +
        "\n" +
        " _     _  _     _  _  _  _  _ \n" +
        "| |  | _| _||_||_ |_   ||_||_|\n" +
        "|_|  ||_  _|  | _||_|  ||_| _|\n"
      )

      numbers.length shouldBe 2
      numbers.head shouldBe "123456789"
      numbers(1) shouldBe "0123456789"

    }

  }

}
