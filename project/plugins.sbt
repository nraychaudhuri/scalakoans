
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.4.0")

libraryDependencies ++= Seq(
  "org.scalastyle" %% "scalastyle" % "0.3.1"
)

//addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.1")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

