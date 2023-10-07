package org.openapitools.api

import org.openapitools.model.AnnouncementCreateRequest
import org.openapitools.model.AnnouncementResponse
import org.openapitools.model.AnnouncementsGet200ResponseInner
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class AnnouncementsApiController() {

    @Operation(
        summary = "공지 단건 조회",
        operationId = "announcementsAnnouncementIdGet",
        description = """이용자가 공지를 1개 조회한다.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ok", content = [Content(schema = Schema(implementation = AnnouncementResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/announcements/{announcementId}"],
        produces = ["application/json"]
    )
    fun announcementsAnnouncementIdGet(@Parameter(description = "공지 ID", required = true) @PathVariable("announcementId") announcementId: java.math.BigDecimal): ResponseEntity<AnnouncementResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "공지 전체 조회",
        operationId = "announcementsGet",
        description = """이용자가 공지를 모두 조회한다.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ok", content = [Content(array = ArraySchema(schema = Schema(implementation = AnnouncementsGet200ResponseInner::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/announcements"],
        produces = ["application/json"]
    )
    fun announcementsGet(): ResponseEntity<List<AnnouncementsGet200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "공지 작성",
        operationId = "announcementsPost",
        description = """이용자가 공지를 작성한다.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Created") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/announcements"],
        consumes = ["application/json"]
    )
    fun announcementsPost(@Parameter(description = "", required = true) @Valid @RequestBody announcementCreateRequest: AnnouncementCreateRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
