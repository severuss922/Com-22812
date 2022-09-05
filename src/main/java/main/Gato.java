package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gato extends Animal {

    private String ruido;

    public Gato(String nombre, String ruido){
        super(nombre);
        this.ruido = ruido;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "ruido='" + ruido + '\'' +
                ", nombre='" + name + '\'' +
                '}';
    }
}
