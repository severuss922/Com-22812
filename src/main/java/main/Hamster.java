package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hamster extends Animal{

    private String atributoHamster;

    public Hamster(String name, String atributoHamster) {
        super(name);
        this.atributoHamster = atributoHamster;
    }

    public void saludoHamster(){
        System.out.println("hola soy un hamster");
    }
}
