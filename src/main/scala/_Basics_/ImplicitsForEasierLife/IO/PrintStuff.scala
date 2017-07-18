package _Basics_.ImplicitsForEasierLife.IO

/**
  * Created by rmutya200 on 6/25/2017.
  */
object PrintStuff {

  /**
    * prints any element, elminates need for brackets
    * @param inputToPrint
    */
  implicit class PrintStuffImplicits(val inputToPrint:Any){
    def p()=println(inputToPrint.toString)
  }
}
