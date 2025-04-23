package demo;// 2.2.1 Using the @Bean annotation to add beans into the Spring context

import demo.bean.Parrot;
import demo.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot p = context.getBean(Parrot.class);
//
//        System.out.println(p);
//        System.out.println(p.getName());

//        Parrot p1 = new Parrot();
//        p1.setName("green");
//        Parrot p2 = new Parrot();
//        p2.setName("MiMo");
//        Parrot p3 = new Parrot();
//        p3.setName("Green");
//
//        Parrot[] parrotArray = new Parrot[]{p1, p2, p3};
//
//        int counter = 1;
//        for (Parrot parrot: parrotArray){
//            String beanName = "greenParrot"+counter++;
//            if(parrot.isGreen()){
//                context.registerBean(beanName, Parrot.class, () -> parrot);
//            }
//        }
//        Scanner in = new Scanner(System.in);
//
//
//        Parrot pp1 = context.getBean("greenParrot1", Parrot.class);
//        Parrot pp2 = context.getBean("greenParrot3", Parrot.class);
//        System.out.println(pp1);
//        System.out.println(pp2);

//        Supplier<Parrot> parrotSupplier = () -> x;
//        context.registerBean("parrot1", Parrot.class, parrotSupplier);
//
//        Parrot p = context.getBean(Parrot.class);
//
//        System.out.println(p.getName());


        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person name is "+ person.getName());

        System.out.println("Parrot's name is "+ parrot.getName());

        System.out.println("Person's parrot name is " + person.getParrot());
    }
}
