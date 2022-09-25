import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import controllers.StandingsController
import modules.Modules

import scala.concurrent.ExecutionContext.Implicits.global

object ServerMain extends Server

class Server extends HttpServer {
  override val modules = Modules()

  override def configureHttp(router: HttpRouter): Unit = {
    router.add[StandingsController]
  }
}


