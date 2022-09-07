package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pajaro extends Animal{

    private String nombreNana;

    private int nivel;

    public Pajaro(String name, String attrPajaro) {
        super(name);
        this.nombreNana = attrPajaro;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "name='" + name + '\'' +
                ", attrPajaro='" + nombreNana + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
