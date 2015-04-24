lazy val commonSettings = Seq(
  organization := "me.lightspeed7",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val scalaTest = "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "functional-thinking",
   libraryDependencies += scalaTest
  )

