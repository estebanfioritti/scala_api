import sbt._

object Dependencies {
  object Versions {
    val akka     = "2.7.0"
    val akkaHttp = "10.2.10"
  }

  val production: Seq[ModuleID] = Seq(
    "com.github.nscala-time"     %% "nscala-time"             % "2.18.0",
    "com.lihaoyi"                %% "pprint"                  % "0.5.3",
    "com.typesafe.akka"          %% "akka-http"               % Versions.akkaHttp,
    "com.typesafe.akka"          %% "akka-actor"              % Versions.akka,
    "com.typesafe.akka"          %% "akka-stream"             % Versions.akka, // Explicit dependency due to: https://bit.ly/akka-http-25
    "com.typesafe.akka"          %% "akka-http-spray-json"    % Versions.akkaHttp,
    "org.tpolecat"               %% "doobie-core"             % "0.5.0-M13",
    "mysql"                      % "mysql-connector-java"     % "8.0.33",
    "com.github.scopt"           %% "scopt"                   % "3.7.0", // Command Line Commands such as de DbTablesCreator
    "com.newmotion"              %% "akka-rabbitmq"           % "5.0.0",
    "ch.qos.logback"             % "logback-classic"          % "1.2.3", // Logging backend implementation
    "com.typesafe.scala-logging" %% "scala-logging"           % "3.7.2", // SLF4J Scala wrapper
    "net.logstash.logback"       % "logstash-logback-encoder" % "4.11" // Log JSON encoder
  )

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"     %% "scalatest"         % "3.0.4"           % Test,
    "org.scalamock"     %% "scalamock"         % "4.0.0"           % Test,
    "com.typesafe.akka" %% "akka-testkit"      % Versions.akka     % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttp % Test
  )
}
