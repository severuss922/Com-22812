package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pajaro extends Animal{

    private String attrPajaro;

    private int nivel;

    public Pajaro(String name, String attrPajaro) {
        super(name);
        this.attrPajaro = attrPajaro;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "name='" + name + '\'' +
                ", attrPajaro='" + attrPajaro + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
