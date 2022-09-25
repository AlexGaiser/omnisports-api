package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import providers.MLBService

import javax.inject.Inject

case class StandingsController @Inject()(mlbProvider: MLBService) extends Controller {
  get("/ping") { request: Request =>
    "pong"
  }

  get("/name") { request: Request =>
    println("hello")
    response.ok.body("Bob")
  }

  get("/standings") { request: Request =>
    response.ok.body(mlbProvider.name)
  }

}


