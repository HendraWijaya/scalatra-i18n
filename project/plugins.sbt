resolvers ++= Seq (
    "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
    , "Web plugin repo" at "http://siasia.github.com/maven2"
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.11"))

resolvers += Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)



