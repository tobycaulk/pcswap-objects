package pcswapobjects.transaction

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.currency.CurrencyInformation

data class TransactionInformation(
        @JsonProperty("RawAmount") var rawAmount: Int,
        @JsonProperty("CurrencyInformation") var currencyInformation: CurrencyInformation)