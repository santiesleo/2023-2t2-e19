ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "2023-2t2-e4",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
