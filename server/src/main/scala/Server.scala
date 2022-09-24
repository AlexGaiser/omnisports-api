import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import controllers.StandingsController

object ServerMain extends Server

class Server extends HttpServer {

  override def configureHttp(router: HttpRouter): Unit = {
    router.add[StandingsController]
  }
}


