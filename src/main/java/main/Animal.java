package main;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
    protected String name;

    public String message(){
       return "hola soy un animal";
    }
}
