package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.Swap

data class GetSwapListingsBySellerResponse(@JsonProperty("SwapListings") var swapListings: List<Swap>?)