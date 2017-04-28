package codingdojo.bankocr

import org.scalatest.{Matchers, WordSpec}

class CheckSumCalculatorSpec extends WordSpec with Matchers {

  val checkSumCalculator = new CheckSumCalculator

  "The check sum calculator" should {

    "calculate a checksum correctly" in {

      checkSumCalculator.calculateCheckSum("000000001") shouldBe 1
      checkSumCalculator.calculateCheckSum("111111111") shouldBe 45
      checkSumCalculator.calculateCheckSum("457508000") shouldBe 187
      checkSumCalculator.calculateCheckSum("490067719") shouldBe 198
      checkSumCalculator.calculateCheckSum("614113121") shouldBe 121
      checkSumCalculator.calculateCheckSum("987654321") shouldBe 285

    }

    "recognize valid account numbers" in {

      checkSumCalculator.isValidAccountNumber("457508000") shouldBe true
      checkSumCalculator.isValidAccountNumber("490067719") shouldBe true
      checkSumCalculator.isValidAccountNumber("614113121") shouldBe true

    }

    "recognize an invalid account number" in {

      checkSumCalculator.isValidAccountNumber("664371495") shouldBe false
      checkSumCalculator.isValidAccountNumber("111111111") shouldBe false
      checkSumCalculator.isValidAccountNumber("987654321") shouldBe false

    }

  }
}
