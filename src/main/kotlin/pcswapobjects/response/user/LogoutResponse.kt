package pcswapobjects.response.user

import com.fasterxml.jackson.annotation.JsonProperty

enum class LogoutResponseStatus {
    SUCCESS,
    FAILURE
}

data class LogoutResponse(@JsonProperty("Status") var status: LogoutResponseStatus)