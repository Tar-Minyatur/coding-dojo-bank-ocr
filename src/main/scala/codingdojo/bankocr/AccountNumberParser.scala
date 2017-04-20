package codingdojo.bankocr

class AccountNumberParser(charExtractor: CharacterExtractor, charParser: CharacterParser) {

  def convertInputToNumbers(input: String): Seq[String] = {

    val lines = input.split("\\n")

    if (lines.length < 3)
      Seq()
    else
      List.range(0, lines.length, 3).map(index =>
        charExtractor.extractCharsFromString(Seq(lines(index), lines(index + 1), lines(index + 2)).mkString("\n")) match {
          case None => ""
          case Some(characters) =>
            characters.map(charParser.parseString(_) match {
              case None => ' '
              case Some(char) => char
            }).foldLeft("")((b, a) => b + a)
      })

  }

}
