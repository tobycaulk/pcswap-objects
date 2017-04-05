package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.swap.Swap

data class GetSwapResponse(@JsonProperty("Swap") var swap: Swap?)