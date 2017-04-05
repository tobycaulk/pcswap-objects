package pcswapobjects.response.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.user.User

data class GetUserResponse(@JsonProperty("User") var user: User?)