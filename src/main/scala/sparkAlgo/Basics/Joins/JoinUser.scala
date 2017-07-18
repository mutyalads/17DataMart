package sparkAlgo.Basics.Joins

/**
  * Created by rmutya200 on 6/26/2017.
  */
object JoinUser {


  /**
    * Common in both tables, and data will be duplicated in the dataframe
    */
  val inner = "INNER"

  /**
    * Left semi join gives things which are in 1 only if they exist in 2
    */
  val lsemi = "LEFT SEMI" // left hand table

  /**
    * Cartesian Join
    */
  val xross = "CROSS"

  /**
    * Gives all values from second combined with right values, places NULL as empty
    */
  val louter = "LEFT OUTER"
  val router = "RIGHT OUTER"

  /**
    * Gives left and right
    */
  val fullouter = "FULL OUTER"

  /**
    * Opposite to semi gives values in 1 only if it does not match in second
    */
  val lanti  = "LEFT ANTI"

  def main(args: Array[String]): Unit = {

  }
}