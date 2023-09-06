package tv.codely.scala_http_api.module.movcta.infrastructure.marshaller

import spray.json.{DefaultJsonProtocol, RootJsonFormat}
import tv.codely.scala_http_api.module.movcta.domain._
import tv.codely.scala_http_api.module.movcta.infrastructure.marshaller.MovCtaAttributesJsonFormatMarshaller.{MovCtaDescripcionMarshaller, MovCtaFechaMarshaller, MovCtaIdMarshaller, MovCtaImporteMarshaller, MovCtadetalleMarshaller}

object MovCtaJsonFormatMarshaller extends DefaultJsonProtocol {
  implicit val movCtaFormat: RootJsonFormat[MovCta] = jsonFormat5(MovCta(_: MovCtaId, _: FechaMovCta, _: Importe, _: Descripcion, _: Detalle))
}
