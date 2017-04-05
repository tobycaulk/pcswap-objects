package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty

enum class AcceptSwapItemOfferResponseStatus {
    SUCCESS,
    FAILURE
}

data class AcceptSwapItemOfferResponse(@JsonProperty("Status") var status: AcceptSwapItemOfferResponseStatus)