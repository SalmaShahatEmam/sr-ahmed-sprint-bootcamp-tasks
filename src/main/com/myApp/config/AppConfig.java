package main.com.myApp.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan(basePackages = {"com.myApp"})
public class AppConfig {
}
