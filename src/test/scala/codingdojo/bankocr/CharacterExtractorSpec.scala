package codingdojo.bankocr

import org.scalatest.{Matchers, WordSpec}

class CharacterExtractorSpec extends WordSpec with Matchers {

  private val extractor = new CharacterExtractor

  "The character extractor" should {

    "leave a single character as it is" in {

      val result = extractor.extractCharsFromString(
        " _ \n" +
        "| |\n" +
        "|_|\n")
      result shouldBe 'defined
      result.get.length shouldBe 1
      result.get.head shouldBe
        " _ " +
        "| |" +
        "|_|"

    }

    "should split two characters into separate strings" in {

      val result = extractor.extractCharsFromString(
        " _  _ \n" +
        "| ||_|\n" +
        "|_||_|\n")
      result shouldBe 'defined
      result.get.length shouldBe 2

    }

    "should be resilient towards lines with omitted trailing spaces" in {

      val result = extractor.extractCharsFromString(
        " _\n" +
        "|_\n" +
        " _|\n")
      result shouldBe 'defined
      result.get.length shouldBe 1

    }

  }

}
