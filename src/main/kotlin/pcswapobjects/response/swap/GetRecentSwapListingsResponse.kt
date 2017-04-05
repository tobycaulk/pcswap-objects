package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.Swap

data class GetRecentSwapListingsResponse(@JsonProperty("SwapListings") var swapListings: List<Swap>?)