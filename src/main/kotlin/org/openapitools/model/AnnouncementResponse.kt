package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Writer
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id 
 * @param title 
 * @param content 
 * @param writer 
 * @param createdAt 
 */
data class AnnouncementResponse(

    @Schema(example = "1", description = "")
    @get:JsonProperty("id") val id: java.math.BigDecimal? = null,

    @Schema(example = "내일부터 재택근무합니다.", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "종료기간은 추후 공지하겠습니다.", description = "")
    @get:JsonProperty("content") val content: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("writer") val writer: Writer? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdAt") val createdAt: java.time.OffsetDateTime? = null
) {

}

