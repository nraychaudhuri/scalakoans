package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.KoanSuite

class AboutMethodsAndFunctions extends KoanSuite with ShouldMatchers {

  koan("Methods can be created using the def keyword") {
    def addOne(x: Int): Int = { return x + 1}
    addOne(10) should be(__) 
  }

  koan("return value of the method is inferred") {
    def addOne(x: Int) = x + 1
    addOne(10) should be(__)
  }

  koan("methods can have methods inside") {
    def fib(n: Int) = {
      def _fib(acc: Int, n: Int): Int = {
        if(n == 0) acc else _fib(acc * n, n - 1)
      }
      _fib(1, n)
    }     
    fib(5) should be(__) 
  }

  koan("function is a type. Its like treating code as data") {
    val addOne: Function1[Int, Int] = x => x + 1
    addOne(10) should be(__)

    //Int is an input and String is the output
    val thisIsAFunctionFromIntToString: Int => String = x => x.toString

    thisIsAFunctionFromIntToString(10) should be(__)
  }

  koan("function type is determined by the number of arguments it takes") {
    val isEven: Function1[Int, Boolean] = ___    
    isEven(10) should be(__)

    //implementing the same function three times    
    val add: Function2[Int, Int, Int] = (a, b) => a + b
    //using the type inference  
    val add2 = (a: Int, b: Int) => a + b
    //declaring the function type by separating input and output
    val add3: (Int, Int) => Int = ___

    val result = add(2, 2) + add2(3, 3) + add3(4, 4)

    result should be(__)    
  }

  koan("function is a type and you can pass it to methods as parameter") {
    
    def insertData(num: Int, precondition: Function1[Int, Boolean]): Boolean = {
      if(precondition(num)) {
        //insert data
        true
      } else false
    }

    val isOdd: Function1[Int, Boolean] = ___

    insertData(10, isOdd) should be(__)
    insertData(3, isOdd) should be(__) 

    //passing anonymous function as a parameter
    insertData(10, x => x % 2 == 0) should be(__) 
  }
}
