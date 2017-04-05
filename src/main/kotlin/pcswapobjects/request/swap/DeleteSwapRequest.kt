package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteSwapRequest(@JsonProperty("SwapId") var swapId: String)