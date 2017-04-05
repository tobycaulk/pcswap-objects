package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.SwapItem

data class GetSwapItemResponse(@JsonProperty("SwapItem") var swapItem: SwapItem)