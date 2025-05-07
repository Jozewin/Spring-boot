package configuration;

import aspect.LoggingAspect;
import aspect.SecurtiyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect(){
        return new LoggingAspect();
    }

    @Bean
    public SecurtiyAspect securtiyAspect(){
        return new SecurtiyAspect();
    }
}
