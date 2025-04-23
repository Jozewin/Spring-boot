import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Coco");
        return p;
    }

    @Bean
    String hello(){
        return "Hello Nigga";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
