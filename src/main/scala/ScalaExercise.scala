object StringUtils {

  def splitWordsToArray(words: String): Array[String] =
    words.split("\\s")

  def findLongestWord(words: String): String = {
    val array = splitWordsToArray(words)
    array.maxBy(_.length)
  }

  def convertListOfStringToListOfCharacter(wordList: List[String]): List[Char] =
    wordList.flatMap(_.toList)
}
