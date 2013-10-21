name := "blog-como-testar-scala"

organization := "br.com.andersonajx"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "joda-time" % "joda-time" % "2.3",
    "org.specs2" %% "specs2" % "1.14" % "test"
)

EclipseKeys.withSource := true
