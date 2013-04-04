name := "99-scala"

organization := "com.yuvimasory"

version := "0.1.0-SNAPSHOT"

homepage := Some(url("https://github.com/ymasory/99-scala"))

startYear := Some(2013)

licenses := Seq(
  ("GPLv3", url("http://www.gnu.org/licenses/gpl-3.0.txt"))
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/ymasory/99-scala"),
    "scm:git:https://github.com/ymasory/99-scala.git",
    Some("scm:git:git@github.com:ymasory/99-scala.git")
  )
)

scalaVersion := "2.10.0"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8",
  "-Xcheckinit",
  "-optimise"
)

scalacOptions ++= Seq(
  "-Yclosure-elim",
  "-Yinline"
)

scalacOptions ++= Seq(
  "-Xverify",
  "-Ywarn-all",
  "-feature",
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:experimental.macros",
  "-language:experimental.dynamics"
)

/* testing */
libraryDependencies ++= Seq (
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.specs2" %% "specs2" % "1.13"
)

parallelExecution in Test := true

parallelExecution in Global := true
