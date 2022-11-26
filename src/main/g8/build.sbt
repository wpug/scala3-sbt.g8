name := "$name$"
version := "0.0.1"

scalaVersion := "3.2.1"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "--explain-types",
  "-encoding", "utf8"
)

// Setting someOtherMain as the default "main method":
//
// Compile / run / mainClass := Some("someOtherMain")
