scalaVersion := "2.13.8"
name := "omnisports-api"
organization := "ch.epfl.scala"
version := "1.0"
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val versions = new {
  val finagleHttp = "22.7.0"
  val finatraHttpServer = "22.7.0"
  val logBack = "1.2.8"
  val injectApp = "22.7.0"
}

lazy val testDependencies = Seq(
  "com.twitter" %% "finatra-http-server" % versions.finatraHttpServer % "test" classifier "tests"
)

lazy val coreDependencies = Seq(
  "com.twitter" %% "finagle-http" % versions.finagleHttp,
  "com.twitter" %% "finatra-http-server" % versions.finatraHttpServer,
  "ch.qos.logback" % "logback-classic" % versions.logBack,
  "com.twitter" %% "inject-app" % versions.injectApp
)

lazy val server = (project in file("server"))
  .settings(
    name := "server",
    libraryDependencies ++= coreDependencies
  )

lazy val test = (project in file("test"))
  .settings(
    name := "test",
    libraryDependencies ++= testDependencies
  )
