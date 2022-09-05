package main;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
    protected String nombre;

    public String message(){
       return "hola soy un animal";
    }
}
