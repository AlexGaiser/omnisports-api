import apis.MLBService
import com.google.inject.{Provides, Singleton}
import com.twitter.inject.TwitterModule

object MLBServiceModule extends TwitterModule {

  @Singleton
  @Provides
  def providesMLBService: MLBService = MLBService()

  def get(): String = {
    providesMLBService.name
  }
}