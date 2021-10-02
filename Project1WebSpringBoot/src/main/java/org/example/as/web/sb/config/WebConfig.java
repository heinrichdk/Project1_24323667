package org.example.as.web.sb.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "org.example.as.web.sb.Controller"
})
public class WebConfig {
}
