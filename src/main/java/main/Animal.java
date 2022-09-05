package main;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
    protected String nombre;

    public void message(){
        System.out.println("animal");
    }
}
