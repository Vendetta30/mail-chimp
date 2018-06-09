package com.mailchimp.model.list

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.mailchimp.model.Link

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ListAbuseReport {
    @JsonProperty("abuse_reports")
    AbuseReport abuseReport
    @JsonProperty("list_id")
    String listId
    @JsonProperty("total_items")
    Integer totalItems
    @JsonProperty("_links")
    List<Link> links
}