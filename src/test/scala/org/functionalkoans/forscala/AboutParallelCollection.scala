package org.functionalkoans.forscala

import support.KoanSuite

class AboutParallelCollection extends KoanSuite {

  koan("running time consuming operation in sequence") {
    val someNumbers = 1 to 5 toVector
    val (_, time) = timeIt {
      someNumbers.map(x => takes500MillsToOperate(x))
    }
    (time < (500 * 5))  should be(__)
  }

  koan("Running computation in parallel. By converting sequential collection to parallel") {
    val someNumbers = 1 to 5 toVector
    val (_, time) = timeIt {
      someNumbers.par.map(x => takes500MillsToOperate(x))
    }
    (time < (500 * 5))  should be(__)
  } 

  koan("""Can all operations be performed in parallel?""") {
    val someNumbers = 1 to 5 toVector
    val (_, time) = timeIt {
      someNumbers.par.foldLeft(0){(acc, elem) =>
        acc + takes500MillsToOperate(elem)
      }
    }
    (time < (500 * 5))  should be(__)
  } 


  def timeIt[A](work: => A): (A, Long) = {
    val s = System.currentTimeMillis
    val result = work
    val e = System.currentTimeMillis
    (work, e - s)
  }

  def takes500MillsToOperate(i: Int): Int = {
    Thread.sleep(500)
    i + 1
  }
}
