package checkSumExperiment

import checkSumExperiment.*
import munit.*

class CheckSumTest extends munit.FunSuite {

  val helloBitsList : List[String] = List("01001000", "01100101", "01101100", "01101100", "01101111")
  val worldBitsList : List[String] = List("01010111", "01101111", "01110010", "01101100", "01100100")
  val scalaBitsList : List[String] = List("01010011", "01100011", "01100001", "01101100", "01100001")
  val pythonBitsList : List[String] = List("01010000", "01111001", "01110100", "01101000", "01101111", "01101110")
  val javaBitsList : List[String] = List("01001010", "01100001", "01110110", "01100001")

  val singleSum = new SingleSum
  val dualSum = new DualSum

  test("singleSum checksum should calculate the correct checksum for valid inputs") {
    assert(singleSum.checkSum(helloBitsList) == "0010001111010010")
    assert(singleSum.checkSum(worldBitsList) == "0010110111011100")
    assert(singleSum.checkSum(scalaBitsList) == "0001010111010000")
    assert(singleSum.checkSum(pythonBitsList) == "0011010001010000")
    assert(singleSum.checkSum(javaBitsList) == "1100000011000010")
  }

  test("singleSum checksum should detect changes in the input data") {
    assert(singleSum.checkSum(List("01001000", "01100101", "01101100", "01101100", "01100101")) != "0010001111010010")
    assert(singleSum.checkSum(List("01010111", "01100101", "01110010", "01101100", "01100100")) != "0010110111011100")
  }

  test("dualSum checksum should calculate the correct checksum for valid inputs") {
    assert(dualSum.checkSum(helloBitsList) == "1111010100101010")
    assert(dualSum.checkSum(worldBitsList) == "0000101001110110")
    assert(dualSum.checkSum(scalaBitsList) == "1110010100100001")
    assert(dualSum.checkSum(pythonBitsList) == "1000010011110100")
    assert(dualSum.checkSum(javaBitsList) == "1000001100101111")
  }

  test("dualSum checksum should detect changes in the input data") {
    assert(dualSum.checkSum(List("01001000", "01100101", "01101100", "01101100", "01100101")) != "1111010100101010")
    assert(dualSum.checkSum(List("01010111", "01100101", "01110010", "01101100", "01100100")) != "0000101001110110")
  }

  test("binarySum should calculate the correct sum for valid inputs") {
    assert(dualSum.binarySum("00000000", "00000000") == "0")
    assert(dualSum.binarySum("00000000", "00000001") == "1")
    assert(dualSum.binarySum("00011011", "00000001") == "00011100")
    assert(dualSum.binarySum("00000001", "00011011") == "00011100")
    assert(dualSum.binarySum("10101010101010101010", "11001100110011001100") == "101110111011101110110")
    assert(dualSum.binarySum("11001100110011001100", "111100001111000011110000") == "111111011011110110111100")
    assert(dualSum.binarySum("111100001111000011110000", "100100110010110010100110") == "1100001000001110110010110")
    assert(dualSum.binarySum("100100110010110010100110", "00000001") == "100100110010110010100111")
  }
}

