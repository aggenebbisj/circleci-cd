logLevel := Level.Warn

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.12.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0-M4")
addSbtPlugin("com.heroku" % "sbt-heroku" % "0.3.7")

addMavenResolverPlugin

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"