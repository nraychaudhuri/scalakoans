addCommandAlias("lets_koan", "~test-only org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.1"

scalaVersion := "2.10.1"

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

// Copy all managed dependencies to <build-root>/lib_managed/
//   This is essentially a project-local cache and is different
//   from the lib_managed/ in sbt 0.7.x.  There is only one
//   lib_managed/ in the build root (not per-project).
retrieveManaged := true

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.scalastyleSourceDir <<= scalaSource in Test

org.scalastyle.sbt.PluginKeys.scalastyleFileFilter ~= {_ =>  
   file => !List("AboutValAndVar.scala", 
            "AboutForExpressions.scala", 
            "AboutLazySequences.scala",
            "Master.scala",
            "AboutOptions.scala",
            "AboutTypeSignatures.scala",
            "AboutTypeVariance.scala",
            "AboutHigherOrderFunctions.scala",
            "AboutImplicits.scala").contains(file.getName)
}

compile in Test <<= (org.scalastyle.sbt.PluginKeys.scalastyle, compile in Test) map { (errors, c) => 
  if(errors > 0) error("One or more style rules failed")
  else c 
}

