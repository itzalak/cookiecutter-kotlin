package io.template.app.infrastructure.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {
    @Bean
    fun apiV1(): OpenAPI =
        OpenAPI()
            .info(
                Info()
                    .title("Example API")
                    .description("Example description for API")
                    .version("v0.0.1"),
            )
}
