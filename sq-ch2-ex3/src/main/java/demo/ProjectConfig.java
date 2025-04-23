package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bean")
public class ProjectConfig {

//    @Bean(name = "hihi")
//    demo.bean.Parrot parrot1(){
//        var p = new demo.bean.Parrot();
//        p.setName("HiHi");
//        return p;
//    }
//
//    @Bean
//    demo.bean.Parrot parrot2(){
//        var p = new demo.bean.Parrot();
//        p.setName("HuHu");
//        return p;
//    }
//
//    @Bean
//    demo.bean.Parrot parrot3(){
//        var p = new demo.bean.Parrot();
//        p.setName("NiqNiq");
//
//        return p;
//    }

//    @Bean
//    public Parrot parrot(){
//        Parrot p = new Parrot();
//        p.setName("Coco");
//        return p;
//    }
//
//    @Bean
//    public Person person(Parrot parrot){
//        Person p = new Person();
//        p.setParrot(parrot);
//        p.setName("UwU");
//        return p;
//    }
}
