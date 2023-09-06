package tv.codely.scala_http_api.entry_point.controller.movcta

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.StandardRoute
import spray.json.DefaultJsonProtocol
import tv.codely.scala_http_api.module.movcta.applicacion.search.MovCtaSearcher
import tv.codely.scala_http_api.module.movcta.infrastructure.marshaller.MovCtaJsonFormatMarshaller._

class MovCtaController(searcher: MovCtaSearcher) extends SprayJsonSupport with DefaultJsonProtocol {

  def get(banca: String, agencia: String, corredor: String, desde: String, hasta: String): StandardRoute =
    complete(searcher.get(banca, agencia, corredor, desde, hasta))

}
