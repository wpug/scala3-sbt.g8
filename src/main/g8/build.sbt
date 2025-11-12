name := "$name$"
version := "0.0.1"

scalaVersion := "3.7.4"

Compile / scalacOptions ++= Seq(
   "-deprecation",         // Emit warning and location for usages of deprecated APIs.
   "-explain",             // Explain errors in more detail.
   "-feature",             // Emit warning and location for usages of features that should be imported explicitly.
   "-print-lines",         // Show source code line numbers.
   "-unchecked",           // Enable additional warnings where generated code depends on assumptions
   "-source:3.7",
   "-encoding", "utf8",
   "-Wconf:cat=other-match-analysis:error"
)
/*

  Currently available compiler options and their meanings can be looked-up in:

  https://github.com/lampepfl/dotty/blob/main/compiler/src/dotty/tools/dotc/config/ScalaSettings.scala

*/

// Setting someOtherMain as the default "main method":
//
// Compile / run / mainClass := Some("someOtherMain")
