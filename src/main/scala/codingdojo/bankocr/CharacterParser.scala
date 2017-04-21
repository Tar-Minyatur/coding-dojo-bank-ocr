package codingdojo.bankocr

class CharacterParser {

  private val char0 =
    " _ " +
    "| |" +
    "|_|"

  private val char1 =
    "   " +
    "  |" +
    "  |"

  private val char2 =
    " _ " +
    " _|" +
    "|_ "

  private val char3 =
    " _ " +
    " _|" +
    " _|"

  private val char4 =
    "   " +
    "|_|" +
    "  |"

  private val char5 =
    " _ " +
    "|_ " +
    " _|"

  private val char6 =
    " _ " +
    "|_ " +
    "|_|"

  private val char7 =
    " _ " +
    "  |" +
    "  |"

  private val char8 =
    " _ " +
    "|_|" +
    "|_|"

  private val char9 =
    " _ " +
    "|_|" +
    " _|"

  def parseString(input: String): Option[Char] =
    input match {
      case `char0` => Option('0')
      case `char1` => Option('1')
      case `char2` => Option('2')
      case `char3` => Option('3')
      case `char4` => Option('4')
      case `char5` => Option('5')
      case `char6` => Option('6')
      case `char7` => Option('7')
      case `char8` => Option('8')
      case `char9` => Option('9')
      case _ => None
    }

}
