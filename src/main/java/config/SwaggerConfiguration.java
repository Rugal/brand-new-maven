package config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for openapi 3.
 *
 * @author Rugal Bernstein
 */
@Configuration
public class SwaggerConfiguration {

  @Bean
  public OpenAPI openApi() {
    return new OpenAPI();
  }
}
