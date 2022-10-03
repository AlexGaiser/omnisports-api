package providers

import apis.MLBClient
import com.twitter.util.Future
import models.MLB.StandingsResponse

import javax.inject.Inject
import scala.concurrent.ExecutionContext


case class MLBService @Inject()(mlbClient: MLBClient)(implicit executionContext: ExecutionContext) {
  val name = "MLB Service"

  def standings(): Future[StandingsResponse] = {
    mlbClient.getStandings()
  }
}

