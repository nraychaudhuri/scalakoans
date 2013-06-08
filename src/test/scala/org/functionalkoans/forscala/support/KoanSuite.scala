package org.functionalkoans.forscala.support

import org.scalatest.exceptions.TestPendingException
import org.scalatest.{Tracker, Stopper, Reporter, FunSuite}
import org.scalatest.matchers.{Matcher, ShouldMatchers}
import org.scalatest.events.{TestPending, TestFailed, TestIgnored, Event}

trait KoanSuite extends FunSuite with ShouldMatchers {

  def koan(name : String)(fun: => Unit) { test(name)(fun) }

  def meditate() = pending

  def  __ : Matcher[Any] = {
    throw new TestPendingException
  }

  def ___ = throw new TestPendingException 

  implicit def anyTo__[A](a: A) = new {
    def  __ : Matcher[Any] = throw new TestPendingException
  }

  protected class ___ extends Exception {
    override def toString = "___"
  }

  private class ReportToTheMaster(other: Reporter) extends Reporter {
    def failure(event: Master.HasTestNameAndSuiteName) {
      info("*****************************************")
      info("*****************************************")
      info("")
      info("")
      info("")
      info(Master.studentFailed(event))
      info("")
      info("")
      info("")
      info("*****************************************")
      info("*****************************************")
    }

    def apply(event: Event) {
      event match {
        case e: TestIgnored => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case e: TestFailed => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case e: TestPending => failure(event.asInstanceOf[Master.HasTestNameAndSuiteName])
        case _ => other(event)
      }

    }
  }

  protected override def runTest(testName: String, reporter: Reporter, stopper: Stopper, configMap: Map[String, Any], tracker: Tracker) {
    if (!Master.studentNeedsToMeditate) {
      super.runTest(testName, new ReportToTheMaster(reporter), Master, configMap, tracker)
    }
  }

}
