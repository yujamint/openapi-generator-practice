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
*/package io.swagger.server.models


/**
 * 
 * @param title 
 * @param content 
 * @param writerId 
 */
data class AnnouncementCreateRequest (

    val title: kotlin.String? = null,
    val content: kotlin.String? = null,
    val writerId: java.math.BigDecimal? = null
) {
}