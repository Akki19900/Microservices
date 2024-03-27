package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account information"
)
public class CustomerDto {

    @Size(min = 5, max = 30, message = "The length of customer name should be between 5 and 30")
    @NotEmpty(message = "Name cannot be null or empty")
    @Schema(
            description = "The name of the customer",
            example = "Akash"

    )
    private String name;

    @NotEmpty(message = "email cannot be null or empty")
    @Email(message = "Email Address should be valid value")
    @Schema(
            example = "akash@example.com",
            description = "The email address of the customer"
    )
    private String email;

    @NotEmpty(message = "Mobile Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            example = "8383838383",
            description = "The mobile number of the customer"
    )
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
