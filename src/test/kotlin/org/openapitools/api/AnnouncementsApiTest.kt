package org.openapitools.api

import org.openapitools.model.AnnouncementCreateRequest
import org.openapitools.model.AnnouncementResponse
import org.openapitools.model.AnnouncementsGet200ResponseInner
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AnnouncementsApiTest {

    private val api: AnnouncementsApiController = AnnouncementsApiController()

    /**
     * To test AnnouncementsApiController.announcementsAnnouncementIdGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun announcementsAnnouncementIdGetTest() {
        val announcementId: java.math.BigDecimal = TODO()
        val response: ResponseEntity<AnnouncementResponse> = api.announcementsAnnouncementIdGet(announcementId)

        // TODO: test validations
    }

    /**
     * To test AnnouncementsApiController.announcementsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun announcementsGetTest() {
        val response: ResponseEntity<List<AnnouncementsGet200ResponseInner>> = api.announcementsGet()

        // TODO: test validations
    }

    /**
     * To test AnnouncementsApiController.announcementsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun announcementsPostTest() {
        val announcementCreateRequest: AnnouncementCreateRequest = TODO()
        val response: ResponseEntity<Unit> = api.announcementsPost(announcementCreateRequest)

        // TODO: test validations
    }
}
