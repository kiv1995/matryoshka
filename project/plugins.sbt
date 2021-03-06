resolvers += "Jenkins-CI" at "http://repo.jenkins-ci.org/repo"
libraryDependencies += "org.kohsuke" % "github-api" % "1.77"

addSbtPlugin("io.get-coursier"       % "sbt-coursier"    % "1.0.0-M15")
addSbtPlugin("de.heikoseeberger"     % "sbt-header"      % "1.6.0")
addSbtPlugin("com.fortysevendeg"     % "sbt-microsites"  % "0.3.3")
addSbtPlugin("org.scala-sbt.plugins" % "sbt-onejar"      % "0.8")
addSbtPlugin("com.jsuereth"          % "sbt-pgp"         % "1.0.0")
addSbtPlugin("com.github.gseitz"     % "sbt-release"     % "1.0.3")
addSbtPlugin("org.scala-js"          % "sbt-scalajs"     % "0.6.14")
addSbtPlugin("org.scoverage"         % "sbt-scoverage"   % "1.5.0")
addSbtPlugin("com.typesafe.sbt"      % "sbt-site"        % "1.1.0")
addSbtPlugin("com.dwijnand"          % "sbt-travisci"    % "1.0.0")
addSbtPlugin("com.eed3si9n"          % "sbt-unidoc"      % "0.3.3")
addSbtPlugin("org.wartremover"       % "sbt-wartremover" % "1.2.1")
