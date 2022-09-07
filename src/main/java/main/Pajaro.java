package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pajaro extends Animal{

    private String nombreNana;

    public Pajaro(String name, String attrPajaro) {
        super(name);
        this.attrPajaro = attrPajaro;
    }
}
