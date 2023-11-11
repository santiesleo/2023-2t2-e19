package checkSumExperiment

class DataManager private (instance : DataManager = null ) {
  
  def TEST_FILE_PREFIX : String = ???

  def getInstance() : DataManager = ???

  def generateData(testSize : Int) : String = ???

  def loadData (filePath : String) : String = ???

  def readData (fileBits : String ) : List[String] = ???

}
