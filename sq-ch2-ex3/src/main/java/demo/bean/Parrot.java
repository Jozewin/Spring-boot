package demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "KiKo";


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public Boolean isGreen(){
//        return name.equalsIgnoreCase("green");
//    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
