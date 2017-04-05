package pcswapobjects.response.swap

import com.fasterxml.jackson.annotation.JsonProperty

data class GetTotalSwapCountResponse(@JsonProperty("TotalSwapCount") var totalSwapCount: Int)