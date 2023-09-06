package tv.codely.scala_http_api.module.movcta.applicacion.search

import tv.codely.scala_http_api.module.movcta.domain.{MovCta, MovCtaRepository}

import scala.concurrent.Future

final class MovCtaSearcher(repository: MovCtaRepository) {
  def get(banca: String, agencia: String, corredor: String, desde: String, hasta: String): Future[Seq[MovCta]] =
    repository.get(banca, agencia, corredor, desde, hasta)
}
