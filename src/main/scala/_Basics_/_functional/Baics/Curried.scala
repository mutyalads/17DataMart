package _Basics_._functional.Baics

/**
  * Created by rmutya200 on 6/26/2017.
  */


/**
  * Converts function of two argument to one argument
  *   Haskell curry discovered this function
  */
object Curried {

  def curry[A,B,C](f:(A,B) => C): A => (B=>C) ={
    a => (b => f(a,b))
//    can be written as a => b => f(a,b) due to right associative
  }
  // uncurry can be done automatically using default Function.uncurried
  def uncurry[A,B,C](f:A=>B=>C):(A,B) => C =
    (a,b) => (f(a))(b)
}
