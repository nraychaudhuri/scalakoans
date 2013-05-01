package org.functionalkoans.forscala

import org.scalatest._
import support.Master

class Koans extends Suite {
  override def nestedSuites = List(
    new AboutAsserts,
    new AboutValAndVar,
    new AboutClasses,
    new AboutRange,
    new AboutTuples,
    new AboutLists,
    new AboutMaps,
    new AboutSets,
    new AboutMutableMaps,
    new AboutMutableSets,
    new AboutFormatting,
    new AboutPatternMatching,
    new AboutCaseClasses,
    new AboutOptions,
    new AboutSequencesAndArrays,
    new AboutNamedAndDefaultArguments,
    new AboutForExpressions,
    new AboutEmptyValues,
    new AboutParentClasses,
    new AboutTypeSignatures,
    new AboutTraits,
    new AboutPreconditions,
    new AboutHigherOrderFunctions,
    new AboutUniformAccessPrinciple,
    new AboutLiteralBooleans,
    new AboutLiteralNumbers,
    new AboutLiteralStrings,
    new AboutPartialFunctions,
    new AboutPartiallyAppliedFunctions,
    new AboutIterables,
    new AboutTraversables,
    new AboutInfixPrefixAndPostfixOperators,
    new AboutInfixTypes,
    new AboutImplicits,
    new AboutManifests,
    new AboutTypeVariance,
    new AboutEnumerations,
    new AboutConstructors
    
  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}
