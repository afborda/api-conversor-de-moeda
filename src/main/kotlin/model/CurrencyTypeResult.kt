package model

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name: String,
    val acronym: String,
    val symbol: String,
    val contryFlagImageUrl: String,
)

@Serializable
data class CurrencyTypesResult(
    val values: List<CurrencyType>
)



val currencyTypes = listOf(
    CurrencyType(
        name = "Dólar Americano",
        acronym = "USD",
        symbol = "$",
        contryFlagImageUrl = "https://flagcdn.com/us.svg"
    ),
    CurrencyType(
        name = "Euro",
        acronym = "EUR",
        symbol = "€",
        contryFlagImageUrl = "https://flagcdn.com/eu.svg"
    ),
    CurrencyType(
        name = "Iene Japonês",
        acronym = "JPY",
        symbol = "¥",
        contryFlagImageUrl = "https://flagcdn.com/jp.svg"
    ),
    CurrencyType(
        name = "Libra Esterlina",
        acronym = "GBP",
        symbol = "£",
        contryFlagImageUrl = "https://flagcdn.com/gb.svg"
    ),
    CurrencyType(
        name = "Yuan Chinês",
        acronym = "CNY",
        symbol = "¥",
        contryFlagImageUrl = "https://flagcdn.com/cn.svg"
    ),
    CurrencyType(
        name = "Dólar Australiano",
        acronym = "AUD",
        symbol = "A$",
        contryFlagImageUrl = "https://flagcdn.com/au.svg"
    ),
    CurrencyType(
        name = "Dólar Canadense",
        acronym = "CAD",
        symbol = "C$",
        contryFlagImageUrl = "https://flagcdn.com/ca.svg"
    ),
    CurrencyType(
        name = "Franco Suíço",
        acronym = "CHF",
        symbol = "CHF",
        contryFlagImageUrl = "https://flagcdn.com/ch.svg"
    ),
    CurrencyType(
        name = "Dólar de Hong Kong",
        acronym = "HKD",
        symbol = "HK$",
        contryFlagImageUrl = "https://flagcdn.com/hk.svg"
    ),
    CurrencyType(
        name = "Dólar de Singapura",
        acronym = "SGD",
        symbol = "S$",
        contryFlagImageUrl = "https://flagcdn.com/sg.svg"
    ),
    CurrencyType(
        name = "Coroa Sueca",
        acronym = "SEK",
        symbol = "kr",
        contryFlagImageUrl = "https://flagcdn.com/se.svg"
    ),
    CurrencyType(
        name = "Won Sul-Coreano",
        acronym = "KRW",
        symbol = "₩",
        contryFlagImageUrl = "https://flagcdn.com/kr.svg"
    ),
    CurrencyType(
        name = "Coroa Norueguesa",
        acronym = "NOK",
        symbol = "kr",
        contryFlagImageUrl = "https://flagcdn.com/no.svg"
    ),
    CurrencyType(
        name = "Dólar Neozelandês",
        acronym = "NZD",
        symbol = "NZ$",
        contryFlagImageUrl = "https://flagcdn.com/nz.svg"
    ),
    CurrencyType(
        name = "Rupia Indiana",
        acronym = "INR",
        symbol = "₹",
        contryFlagImageUrl = "https://flagcdn.com/in.svg"
    ),
    CurrencyType(
        name = "Peso Mexicano",
        acronym = "MXN",
        symbol = "$",
        contryFlagImageUrl = "https://flagcdn.com/mx.svg"
    ),
    CurrencyType(
        name = "Rublo Russo",
        acronym = "RUB",
        symbol = "₽",
        contryFlagImageUrl = "https://flagcdn.com/ru.svg"
    ),
    CurrencyType(
        name = "Rand Sul-Africano",
        acronym = "ZAR",
        symbol = "R",
        contryFlagImageUrl = "https://flagcdn.com/za.svg"
    ),
    CurrencyType(
        name = "Lira Turca",
        acronym = "TRY",
        symbol = "₺",
        contryFlagImageUrl = "https://flagcdn.com/tr.svg"
    ),
    CurrencyType(
        name = "Real Brasileiro",
        acronym = "BRL",
        symbol = "R$",
        contryFlagImageUrl = "https://flagcdn.com/br.svg"
    )

)