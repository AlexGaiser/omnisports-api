scalaVersion := "2.12.12"
name := "omnisports-api"
organization := "ch.epfl.scala"
version := "1.0"
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val versions = new {
  val finagleHttp = "22.7.0"
  val finatraHttpServer = "22.7.0"
  val logBack = "1.2.8"
  val injectApp = "22.7.0"
  val jacksonVersion = "2.13.3"
  val circeVersion = "0.14.1"
  val json4sVersion = "4.0.6"
}

lazy val testDependencies = Seq(
  "com.twitter" %% "finatra-http-server" % versions.finatraHttpServer % "test" classifier "tests"
)

lazy val coreDependencies = Seq(
  "com.twitter" %% "finagle-http" % versions.finagleHttp,
  "com.twitter" %% "finatra-http-server" % versions.finatraHttpServer,
  "ch.qos.logback" % "logback-classic" % versions.logBack,
  "com.twitter" %% "inject-app" % versions.injectApp,
  "com.softwaremill.sttp.client3" %% "core" % "3.8.2",
  "com.softwaremill.sttp.client3" %% "json4s" % "3.8.2",
  "com.softwaremill.sttp.client3" %% "akka-http-backend" % "3.8.2",
  "com.softwaremill.sttp.client3" %% "circe" % "3.8.2",
  "com.typesafe.akka" %% "akka-stream" % "2.6.20",
  "org.json4s" %% "json4s-native" % versions.json4sVersion,
  "org.json4s" %% "json4s-core" % versions.json4sVersion,
  "io.circe" %% "circe-core" % versions.circeVersion,
  "io.circe" %% "circe-generic" % versions.circeVersion,
  "io.circe" %% "circe-parser" % versions.circeVersion,
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
