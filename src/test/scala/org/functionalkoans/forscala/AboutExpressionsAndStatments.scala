package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.KoanSuite

class AboutExpressionsAndStatments extends KoanSuite with ShouldMatchers {

  koan("expressions always return value") {
    val a = 1 + 1
    val b = if(a == 2) 3 else 4
    b should be(__)
  }

  koan("there is no void, every expression returns some type") {
    val a = println("there is no void in scala")
    a should be(__)
    
    val b = try { 10 } catch { case _: Throwable => 5 }
    b should be(__)
  }

  koan("Statements does not return anything") {
    import java.util._
    class X
    //assign to a variable doesn't return anything
    //val a = (val b = 10)
  }
}








