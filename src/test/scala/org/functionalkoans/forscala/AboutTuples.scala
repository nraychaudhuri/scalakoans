package org.functionalkoans.forscala

import support.KoanSuite
import java.util.Date

class AboutTuples extends KoanSuite {

  koan("Tuples can be created easily") {
    val tuple = ("apple", "dog")
    tuple should be(Tuple2(__, __))
  }

  koan("Tuple items may be accessed individually") {
    val tuple = ("apple", "dog")
    val fruit: String = tuple._1
    val animal = tuple._2

    fruit should be(__)
    animal should be(__)
  }

  koan("Tuples may be of mixed type. Think of them as a collection of mixed types") {
    val tuple5 = ("a", 1, 2.2, new Date(), BigDecimal(5))

    tuple5._2 should be(__)
    tuple5._5 should be(__)
  }
}
