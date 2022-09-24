package controllers

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

import javax.inject.Inject

case class StandingsController @Inject()() extends Controller {
  get("/ping") { request: Request =>
    "pong"
  }

  get("/name") { request: Request =>
    println("hello")
    response.ok.body("Bob")
  }
}


