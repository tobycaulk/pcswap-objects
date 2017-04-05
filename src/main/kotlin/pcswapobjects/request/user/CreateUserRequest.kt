package pcswapobjects.request.user

import com.fasterxml.jackson.annotation.JsonProperty
import pcswapobjects.request.NoSessionPayload

data class CreateUserRequest(
        @JsonProperty("Username") var username: String,
        @JsonProperty("Email") var email: String,
        @JsonProperty("Password") var password: String) : NoSessionPayload