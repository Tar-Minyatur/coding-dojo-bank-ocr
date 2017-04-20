package codingdojo.bankocr

import scala.collection.Seq

class CharacterExtractor {

  def extractCharsFromString(input: String): Option[Seq[String]] = {
    val lines = input.split("\\n")
    if (lines.length != 3) {
      None
    } else {
      try {
        val tokenizedLines = lines.map(makeLineSafeToTokenize).map(line =>
          List.range(0, line.length, 3).map(start => line.substring(start, start + 3))
        )
        Option(
          List.range(0, tokenizedLines.head.length)
            .map(index => tokenizedLines(0)(index) + tokenizedLines(1)(index) + tokenizedLines(2)(index))
        )
      } catch {
        case _: RuntimeException => None
      }
    }
  }

  def makeLineSafeToTokenize(line: String): String =
    if (line.length % 3 > 0)
      line + (" " * (3 - (line.length % 3)))
    else
      line

}
