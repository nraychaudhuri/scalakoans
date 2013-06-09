package org.functionalkoans.forscala

import org.scalatest._
import support.Master

class Koans extends Suite {
  override def nestedSuites = List(
    //basic
    new AboutAsserts,
    new AboutValAndVar,
    new AboutLiterals,
    new AboutLiteralStrings,
    new AboutExpressionsAndStatments,
    new AboutMethodsAndFunctions,
    new AboutRange,
    new AboutTuples,
    new AboutLists,
    new AboutMaps,
    new AboutSets,
    new AboutMutableCollections,
    new AboutParallelCollection,    
    //oo
    new AboutClasses,
    new AboutConstructors,
    new AboutParentClasses,
    new AboutNamedAndDefaultArguments,
    new AboutCaseClasses,
    new AboutTraits,
    new AboutUniformAccessPrinciple,
    //fp    
    new AboutPatternMatching,
    new AboutOptions,
    new AboutForExpressions,
    new AboutHigherOrderFunctions,
    new AboutPartialFunctions,
    new AboutPartiallyAppliedFunctions,
    //implicits
    new AboutImplicits
    //extra 
    //new AboutPreconditions,    
    //new AboutTypeSignatures,
    // new AboutEmptyValues,
    //new AboutSequencesAndArrays,
    // new AboutIterables,
    // new AboutTraversables,
    // new AboutInfixPrefixAndPostfixOperators,
    // new AboutInfixTypes,
    // new AboutFormatting,
    //new AboutManifests,
    //new AboutTypeVariance,
    //new AboutEnumerations    
  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}
