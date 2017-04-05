package pcswapobjects.request.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.request.NoSessionPayload

data class GetUserRequest(@JsonProperty("UserId") var userId: String): NoSessionPayload