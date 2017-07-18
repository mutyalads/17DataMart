package _Basics_._functional.Baics.List

import _Basics_.ImplicitsForEasierLife.IO.PrintStuff._
/**
  * Created by rmutya200 on 6/25/2017.
  */
object ListUsage {

  // fill and stats
  val list =  List.fill(10)(11)

  //filter and filternot


//  List and Element
    val listPlusOne = List(10) :+ 11
    val onePlusList = 10 +: List(11)

//  Between Lists
    // add and subtract elements
    val listAdd = List(12) ++ list
    val listDiff = List(1,2,2,3,4) diff List(1,2)
    val listDiffSub = List(1,2,2,3,4) filterNot List(1,2).contains

    // divide and add lists
    val listHead :: listtail = listAdd
    val list2 = List(listHead) ::: listtail

  //split and fold

  // Partition

  // zip and unzip
   val (listx,listy) = List((2,"a"),(3,"b")).unzip
  // lift and unlift

  def main(args: Array[String]): Unit = {
    list.p
    listDiff.p
    listDiffSub.p
  }
}
