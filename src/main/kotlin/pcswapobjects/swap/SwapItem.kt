package pcswapobjects.swap

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document
import pcswapobjects.transaction.TransactionInformation

@Document(collection="swapItem")
data class SwapItem @PersistenceConstructor constructor(
        @Id @JsonProperty("SwapItemId") var swapItemId: String?,
        @JsonProperty("UserId") var userId: String?,
        @JsonProperty("Item") var item: String,
        @JsonProperty("Description") var description: String?,
        @JsonProperty("ImageUrl") var imageUrl: String?)