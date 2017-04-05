package pcswapobjects.request.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.request.NoSessionPayload

data class GetUserSessionRequest(@JsonProperty("SessionId") var sessionId: String)