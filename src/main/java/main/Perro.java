package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Perro extends Animal {

    private String ruido;

    public Perro(String nombre, String ruido){
        super(nombre);
        this.ruido=ruido;
    }

}
