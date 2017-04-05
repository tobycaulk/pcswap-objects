package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty

data class GetSwapRequest(@JsonProperty("SwapId") var swapId: String)