/**
* 열심히해보자
* 뭐지
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.handle
import io.ktor.locations.location
import io.ktor.locations.Location
import io.ktor.util.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method
import io.swagger.server.models.*;


// NOTE: ktor-location@0.9.0 is missing extension for Route.delete. This includes it.
inline fun <reified T : Any> Route.delete(noinline body: suspend PipelineContext<Unit, ApplicationCall>.(T) -> Unit): Route {
    return location(T::class) {
        method(HttpMethod.Delete) {
            handle(body)
        }
    }
}

object Paths {
    /**
     * 공지 단건 조회
     * 이용자가 공지를 1개 조회한다.
     * @param announcementId 공지 ID 
     */
    @Location("/announcements/{announcementId}") class announcementsAnnouncementIdGet(val announcementId: java.math.BigDecimal)

    /**
     * 공지 전체 조회
     * 이용자가 공지를 모두 조회한다.
     */
    @Location("/announcements") class announcementsGet()

    /**
     * 공지 작성
     * 이용자가 공지를 작성한다.
     * @param body  
     */
    @Location("/announcements") class announcementsPost(val body: AnnouncementCreateRequest)

}
