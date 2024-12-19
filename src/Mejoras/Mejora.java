package Mejoras;

import Modelo.Coche;

public class Mejora extends Coche {
    private Coche coche;

    public Mejora(Coche coche) {
        super("", 0,0);
        this.coche = coche;
    }

    public double getCoste() {
        return coche.getCoste();
    }
    public double getCosteBase(){
        return coche.getCosteBase();
    }

    public String getInfo() {
        return coche.getInfo(); }

}
