package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold the successful response Information"
)
public class ResponseDto {


    @Schema(
            description = "Status Code in the response",
            example = "200 OK"
    )
    private String statusCode;
    @Schema(
            description = "Status message in the response",
            example = "Request Processed Successfully"
    )
    private String statusMsg;

}
