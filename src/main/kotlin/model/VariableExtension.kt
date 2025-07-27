package com.rocketseat.model

fun String.orUnknown(): String =
    if(this in exchangeRates.keys) this else "Desconhecido"