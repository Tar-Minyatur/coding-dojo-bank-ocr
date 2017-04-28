package codingdojo.bankocr

class CheckSumCalculator {

  def calculateCheckSum(input: String): Int =
    List.range(0, input.length).map(index => input(index).asDigit * (input.length - index)).sum

  def isValidAccountNumber(input: String): Boolean =
    calculateCheckSum(input) % 11 == 0

}
