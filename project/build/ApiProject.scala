import sbt._
 
class ApiProject(info: ProjectInfo) extends DefaultWebProject(info) {
   val snapshots = "Java.net Repository" at "http://download.java.net/maven/2/"
   val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.23" % "test->default"	
   val jersey = "com.sun.jersey" % "jersey-server" % "1.1.5.1" % "test->default" 
   val jsr311 = "javax.ws.rs" % "jsr311-api" % "1.1-ea" % "compile->default"
   val lucene = "org.apache.lucene" % "lucene-core" % "3.0.1" % "compile->default"
}