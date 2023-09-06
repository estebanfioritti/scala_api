package tv.codely.scala_http_api.module.movcta.infrastructure.dependency_injection

import tv.codely.scala_http_api.module.movcta.applicacion.search.MovCtaSearcher
import tv.codely.scala_http_api.module.movcta.infrastructure.repository.DoobieMySqlMovCtaRepository
import tv.codely.scala_http_api.module.shared.infrastructure.persistence.doobie.DoobieDbConnection

import scala.concurrent.ExecutionContext

class MovCtaModuleDependencyContainer(doobieDbConnection: DoobieDbConnection)(
    implicit executionContext: ExecutionContext) {

  val repository: DoobieMySqlMovCtaRepository = new DoobieMySqlMovCtaRepository(doobieDbConnection)

  val movctaSearcher: MovCtaSearcher = new MovCtaSearcher(repository)

}
