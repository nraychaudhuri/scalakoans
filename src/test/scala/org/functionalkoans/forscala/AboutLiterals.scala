package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.KoanSuite

class AboutLiterals extends KoanSuite with ShouldMatchers {

  koan("Boolean literals are either true or false, using the true or false keyword") {
    val a = true
    val b = false
    val c = 1 > 2
    val d = 1 < 2
    a should be(__)
    b should be(__)
    c should be(__)
    d should be(__)
  }

  koan("Integer Literals are 32-bit and can be created from decimal or hexadecimal") {
    val a = 2
    val b = 31
    val c = 0x30F
    val d = -2
    val e = -0x30F
    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    d should be(__)
    e should be(__) //Hint: 30F = 783

    //octal literal is deprecated: 
    //http://stackoverflow.com/questions/16590236/scala-2-10-octal-escape-is-deprecated-how-to-do-octal-idiomatically-now
  }

  koan("""Long Literals are 64 bit, are specified by appending an L or l at the end;
         |   l is rarely used since it looks like a 1""") {
    val a = 2L
    val b = 31L
    val c = 0x30FL
    val e = 0L
    val f = -2l
    val g = -31L
    val h = -0x30FL

    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__) //Hint: 30F = 783
  }

  koan("""Float and Double Literals are IEEE 754 for specific,
         |   Float are 32-bit length, Doubles are 64-bit.
         |   Floats can be coerced using a f or F suffix, and
         |   Doubles can be coerced using a d or D suffix.
         |   Exponent are specified using e or E.""") {

    val a = 3.0
    val b = 3.00
    val c = 2.73
    val d = 3f
    val e = 3.22d

    a should be(__)
    b should be(__)
    c should be(__)
    d should be(__)
    e should be(__)
  }

  koan("""Trick: To distinguish the dot for a method invocation from the
          |   decimal point in a float or double literal,
          |   add a space after the literal""") {
    3.0.toString should be(__)
    3.toString should be(__)
    (3.0 toString) should be(__)
    3d.toString should be(__)
  }


}
