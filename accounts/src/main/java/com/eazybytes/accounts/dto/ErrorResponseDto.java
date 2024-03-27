package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(name = "Error Response", description = "Schema to hold the error response Information")
public class ErrorResponseDto {


    @Schema(description = "API path invoked by client")
    private String apiPath;

    @Schema(description = "Error code representing the error occurred")
    private HttpStatus errorCode;

    @Schema(description = "Error message describing the error")
    private String errorMessage;

    @Schema(description = "Shows error occurred Timing")
    private LocalDateTime errorTime;

}
