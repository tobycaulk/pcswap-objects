package pcswapobjects.response.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.user.UserSession

data class GetUserSessionResponse(@JsonProperty("Session") var session: UserSession?)