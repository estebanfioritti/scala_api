package tv.codely.scala_http_api.module.movcta.domain

case class Importe(valor: Double)

object Importe {

  def apply(valor: String): Importe = Importe(valor.toDouble)

}
