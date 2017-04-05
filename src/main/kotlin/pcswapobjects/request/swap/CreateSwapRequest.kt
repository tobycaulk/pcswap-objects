package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.SwapItem

data class CreateSwapRequest(
        @JsonProperty("SellItem") var sellItem: SwapItem,
        @JsonProperty("TradeForItems") var tradeForItems: List<SwapItem>)