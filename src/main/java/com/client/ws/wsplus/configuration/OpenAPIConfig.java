package com.client.ws.wsplus.configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI wsOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Swagger WS")
                        .description("Api para atender o client WS Plus")
                        .version("v1")
                        .license(new License().name("demo")));

    }
}
