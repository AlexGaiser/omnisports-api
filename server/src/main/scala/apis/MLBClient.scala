package apis

import com.twitter.finagle.{Http, Service, http}

class MLBClient(baseUrl: String = "statsapi.mlb.com:80/api/v1/standings/?leagueId=103") {
  val client: Service[http.Request, http.Response] = Http.newService("statsapi.mlb.com:80")

  def getStandings() = {
    val request = http.Request(http.Method.Get, "/api/v1/standings/?leagueId=103")
    request.host("statsapi.mlb.com:80")
    client(request)
  }
}
