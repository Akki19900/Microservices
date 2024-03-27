package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of EasyBytes account"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type cannot be null or empty")
    @Schema(
            description = "Account Type of EasyBytes account",
            example = "Saving/Current"
    )
    private String accountType;

    @NotEmpty(message = "Branch Address  cannot be null or empty")
    @Schema(
            description = "Eazy Bank Address",
            example = "Robert Robertson, 1234 NW Bobcat Lane, St. Robert, MO 65584-5678."
    )
    private String branchAddress;
}
