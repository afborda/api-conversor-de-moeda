package com.rocketseat

import com.rocketseat.model.ExchangeRateResult
import com.rocketseat.model.exchangeRates
import com.rocketseat.model.orUnknown
import model.CurrencyTypesResult
import model.currencyTypes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.math.BigDecimal
import java.math.RoundingMode

fun Application.configureRouting() {
    routing {
        //tipos de moedas ( acronimo, nome, simbolo, imagem da bandeirado pais)
        get("/currency_types") {
            call.respond(
                CurrencyTypesResult(
                    values = currencyTypes
                )
            )
        }
        //conversão de valores, moeda atual => moeda alvo taxa de conversão entre as 2
        //obs: from e to serão os acronimos das moedas
        get("/exchange_rate/{from}/{to}"){
            val from = call.parameters["from"]?.uppercase()?:return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possivel obter o acronimo da mueda atual."
            )
            val to = call.parameters["to"]?.uppercase()?:return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possivel obter o acronimo da moeda alvo."
            )

            val rate = exchangeRates[from]?.get(to)

            val roundedRate = rate?.let {
                BigDecimal(it).setScale(2, RoundingMode.CEILING).toDouble()
            } ?: 0.0

            call.respond(
                ExchangeRateResult(
                    from = from.orUnknown(),
                    to = to.orUnknown(),
                    exchangeRate = roundedRate
                )
            )
        }
    }
}
