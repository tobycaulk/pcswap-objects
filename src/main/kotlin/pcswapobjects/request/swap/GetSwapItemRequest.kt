package pcswapobjects.request.swap

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.request.NoSessionPayload

data class GetSwapItemRequest(@JsonProperty("SwapItemId") var swapItemId: String): NoSessionPayload