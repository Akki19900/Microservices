package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(title = "Accounts Microservices REST API Documentation",
                description = "Easy Bank Accounts Microservices REST API Documentation",
                version = "v1",
                contact = @Contact(name = "Akash",
                        email = "akash.waghmare@npstx.com",
                        url = "http://google.com"
                ),
                license = @License(
                        url = "http://www.opensource.org/licenses/",
                        name = "Openapi License"
                )
        ),
        externalDocs = @ExternalDocumentation(description = "Easy Bank Accounts Microservices REST API Documentation",
                url = "http://google.com"

        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }
}
