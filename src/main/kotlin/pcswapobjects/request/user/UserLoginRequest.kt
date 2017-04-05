package pcswapobjects.request.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.request.NoSessionPayload

data class UserLoginRequest(@JsonProperty("Email") var email: String,
                            @JsonProperty("Password") var password: String): NoSessionPayload