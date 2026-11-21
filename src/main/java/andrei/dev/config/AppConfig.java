package andrei.dev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"andrei.dev.service", "andrei.dev.properties"})
public class AppConfig {
}