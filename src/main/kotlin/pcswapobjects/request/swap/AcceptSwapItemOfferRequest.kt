package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty

data class AcceptSwapItemOfferRequest(
        @JsonProperty("SwapId") var swapId: String,
        @JsonProperty("SwapItemId") var swapItemId: String)