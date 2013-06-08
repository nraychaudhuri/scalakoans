package org.functionalkoans.forscala

import support.KoanSuite
import scala.collection.mutable

class AboutMutableCollections extends KoanSuite {

  koan("Mutable maps can be created easily") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.size should be(__)
    myMap += "OR" -> "Oregon"
    myMap contains "OR" should be(__)
  }

  koan("Mutable maps can have elements removed") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap -= "OH"
    myMap contains "OH" should be(__)
  }

  koan("Mutable maps can have tuples of elements added") {
    val myMap = mutable.Map("MI" -> "Michigan", "WI" -> "Wisconsin")
    myMap += ("IA" -> "Iowa", "OH" -> "Ohio")
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable maps can be cleared") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.clear() // Convention is to use parens if possible when method called changes state
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable sets can be created easily") {
    val mySet = mutable.Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    mySet.size should be(__)
    mySet += "Oregon"
    mySet contains "Oregon" should be(__)
  }

  koan("Mutable sets can have elements removed") {
    val mySet = mutable.Set("Michigan", "Ohio", "Wisconsin", "Iowa")
    mySet -= "Ohio"
    mySet contains "Ohio" should be(__)
  }

  koan("ListBuffer is the mutable sibling of List") {
    val buffer = mutable.ListBuffer("Michigan", "Ohio", "Wisconsin", "Iowa")
    val list = List("Michigan", "Ohio", "Wisconsin", "Iowa")
    buffer :+ "Oregon"
    list :+ "Oregon"

    buffer contains "Oregon" should be(__)
    list contains "Oregon" should be(__)
  }

  koan("You can remove elements from buffer") {
    val buffer = mutable.ListBuffer("Michigan", "Ohio", "Wisconsin", "Iowa")
    buffer -= "Ohio"
    buffer contains "Ohio" should be(__)
  }

}
