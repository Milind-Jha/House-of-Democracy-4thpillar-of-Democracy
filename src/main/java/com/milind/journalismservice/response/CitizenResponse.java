package com.milind.journalismservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.milind.journalismservice.enums.CitizenStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CitizenResponse {

    @JsonProperty("id")  // Ensure the "id" field is serialized as "id"
    private Long id;

    @JsonProperty("name")  // Ensure the "name" field is serialized as "name"
    private String name;

    @JsonProperty("aadharNumber")  // Ensure the "aadharNumber" field is serialized as "aadharNumber"
    private String aadharNumber;

    @JsonProperty("status")  // Ensure the "status" field is serialized as "status"
    private CitizenStatus status;
}
