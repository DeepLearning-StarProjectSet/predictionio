import AssemblyKeys._

assemblySettings

name := "example-scala-test"

organization := "org.sample"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "io.prediction" %% "core" % "0.8.0-SNAPSHOT" % "provided",
  "io.prediction" %% "data" % "0.8.0-SNAPSHOT" % "provided",
  "org.apache.spark" %% "spark-core" % "1.0.2" % "provided")
