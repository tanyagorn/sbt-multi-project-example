import org.scalatest.FunSpec

import scala.collection.immutable.HashMap

class StringUtilsTest extends FunSpec {

  describe("Find longest word") {
    it("should return the longest word in the string separated by space") {
      assert(StringUtils.findLongestWord("Dummy string just for testing") == "testing")
    }
  }

  describe("Convert list of string to list of character") {
    it("should return list of character of all the characters in all the strings") {
      val expect = List('o', 'n', 'e', 't', 'w', 'o', '3')
      assert(StringUtils.convertListOfStringToListOfCharacter(List("one", "two", "3")).equals(expect))
    }
  }
}
