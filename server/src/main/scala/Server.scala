import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.google.inject.Module
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.jackson.modules.ScalaObjectMapperModule
import com.twitter.util.jackson.ScalaObjectMapper
import controllers.StandingsController
import modules.{Modules}
import modules.server.CamelCaseJacksonModule

import scala.concurrent.ExecutionContext.Implicits.global

object ServerMain extends Server

class Server extends HttpServer {
  override val modules = Modules()

  override def configureHttp(router: HttpRouter): Unit = {
    router.add[StandingsController]
  }

  override def jacksonModule: Module = new CamelCaseJacksonModule()
}


