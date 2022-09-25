package modules.providers

import apis.MLBClient
import com.google.inject.{Provides, Singleton}
import com.twitter.inject.TwitterModule

class MLBClientModule extends TwitterModule {

  @Singleton
  @Provides
  def mlbClient()() = {
    new MLBClient()
  }
}
