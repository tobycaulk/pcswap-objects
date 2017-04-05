package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.SwapItem

data class OfferSwapItemRequest(@JsonProperty("SwapId") var swapId: String,
                                @JsonProperty("SwapItem") var swapItem: SwapItem)