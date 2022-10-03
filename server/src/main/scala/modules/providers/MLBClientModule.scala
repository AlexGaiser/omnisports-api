package modules.providers


import apis.MLBClient
import com.google.inject.{Provides, Singleton}
import com.twitter.inject.TwitterModule

import scala.concurrent.ExecutionContext

class MLBClientModule extends TwitterModule {

  @Singleton
  @Provides
  def mlbClient()(implicit executionContext: ExecutionContext) = {
    new MLBClient()
  }
}
