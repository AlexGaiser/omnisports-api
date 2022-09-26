package providers

import apis.MLBClient

import javax.inject.Inject


case class MLBService @Inject()(mlbClient: MLBClient) {
  val name = "MLB Service"

  def standings() = {
    mlbClient.getStandings()
  }

}
