package net.besquared.api

import javax.ws.rs._
 
@Path("/hello")
class Hello {
  @GET @Produces(Array("text/html"))
  def doGet = "<html><body><p>Hello? You could be seeing Why? right now...</p></body></html>"
}