package pcswapobjects.request.user

import com.fasterxml.jackson.annotation.JsonProperty

data class LogoutRequest(@JsonProperty("SessionId") var sessionId: String)