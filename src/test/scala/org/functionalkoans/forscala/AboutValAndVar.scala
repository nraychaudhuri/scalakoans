package org.functionalkoans.forscala

import support.KoanSuite

class AboutValAndVar extends KoanSuite {

  koan("vars may be reassigned") {
    var a = 5
    a should be(10)

    a = 7
    a should be(__)
  }

  koan("vals may not be reassigned") {
    val a = 5
    a should be(__)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (7)
  }


  koan("vals may be lazy") {
    var counter = 0
    lazy val iAmLazyToWork = {
      counter += 1
      counter + 10
    }

    counter should be(0)

    iAmLazyToWork should be(11)
    counter should be(1) 

    val b = iAmLazyToWork    
    b should be(11)
    counter should be(1) 

  }

}
