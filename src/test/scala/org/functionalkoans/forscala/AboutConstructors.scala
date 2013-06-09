package org.functionalkoans.forscala

import support.KoanSuite

class AboutConstructors extends KoanSuite {

  class AboutConstructorWithAuxiliaryConstructor(val name: String) {
    // invoke auxiliary constructor
    def this() {
      // what happens if you comment out the following line?
      this ("defaultname")
    }

    def this(a: String, b: String) {
      this(a + b)
    }
  }


  koan("Primary constructor specified with a parameter requires that parameter to be passed in") {
    val aboutMe = new AboutConstructorWithAuxiliaryConstructor("a", "b")
    aboutMe.name should be (__)
    (new AboutConstructorWithAuxiliaryConstructor).name should be(__)
  }

  class AboutClassWithNoClassParameter 

  koan("Class with no class parameters is called with no arguments") {
    // add parameter to make this fail
    val aboutMe = new AboutClassWithNoClassParameter
  }
}
