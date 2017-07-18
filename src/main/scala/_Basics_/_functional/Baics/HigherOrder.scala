package _Basics_._functional.Baics

import scala.annotation.tailrec
import _Basics_.ImplicitsForEasierLife.IO.PrintStuff._
/**
  * Created by rmutya200 on 6/26/2017.
  */


/**
  * Higher order functions are method which takes another method as input
  */


object HigherOrder {

  // Monomorphic functions single type
  def abs(x:Int) = if(x < 0) x * -1 else x
  def format(x:Int,f:Int=>Int) = f(x).p
  format(1,abs)

  //PolyMorphic Functions: generic functions
  def findFirtst[A](as:Array[A],p1:A=>Boolean): Int = {
    @tailrec
    def loop(n:Int): Int =
      if(n >= as.length) -1
      else if (p1(as(n))) n
      else loop(n+1)
    loop(0)
  }

  //Compose functions
  val f = (x :Double) => math.Pi / 2-x
  val cos = f andThen math.sin
  val cos2 = f compose math.sin

  def main(args: Array[String]): Unit = {
    (cos,cos2).p
    cos(10).p
  }
}


