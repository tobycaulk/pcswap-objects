package pcswapobjects.response

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.error.PCSwapError

data class ResponseBase<T>(
        @JsonProperty("SessionId") var sessionId: String?,
        @JsonProperty("Error") var error: PCSwapError?,
        @JsonProperty("Payload") var payload: T?)