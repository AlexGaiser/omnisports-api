package apis

import com.twitter.finagle.{Http, Service, http}
import com.twitter.finatra.jackson.modules.ScalaObjectMapperModule
import com.twitter.util.jackson.ScalaObjectMapper
import models.MLB.StandingsResponse
import utils.{SttpClient}

import java.net.URL
import scala.concurrent.ExecutionContext

class MLBClient(baseUrl: String = "statsapi.mlb.com:80/api/v1/standings/?leagueId=103")(implicit executionContext: ExecutionContext) {
  def getStandings() = {
    val url = new URL("http://statsapi.mlb.com:80/api/v1/standings/?leagueId=103")
    SttpClient().get[StandingsResponse](url)
  }
}

