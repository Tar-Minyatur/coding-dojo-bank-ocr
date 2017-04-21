package codingdojo.bankocr

import scala.collection.Seq

class CharacterExtractor {

  def extractCharsFromString(input: String): Option[Seq[String]] = {
    val lines = input.split("\\n")
    if (lines.length != 3)
      None
    else {
      val tokenizedLines = lines.map(makeLineSafeToTokenize).map(line =>
        List.range(0, line.length, 3).map(start => line.substring(start, start + 3))
      )
      Option(splitLinesIntoMultilineChars(tokenizedLines))
    }
  }

  private def splitLinesIntoMultilineChars(tokenizedLines: Array[List[String]]) =
    List.range(0, tokenizedLines.head.length)
      .map(index => tokenizedLines(0)(index) + tokenizedLines(1)(index) + tokenizedLines(2)(index))

  private def makeLineSafeToTokenize(line: String): String =
    if (line.length % 3 > 0)
      line + (" " * (3 - (line.length % 3)))
    else
      line

}
