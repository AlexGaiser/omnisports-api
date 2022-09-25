package modules

import com.google.inject.Module
import modules.providers.MLBClientModule

import scala.concurrent.ExecutionContext

object Modules {
  def apply()(implicit executionContext: ExecutionContext): List[Module] = List(
    new MLBClientModule()
  )
}
