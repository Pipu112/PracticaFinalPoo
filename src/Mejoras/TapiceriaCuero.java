package Mejoras;

import Modelo.Coche;

public class TapiceriaCuero extends Mejora {
    private double incremento;
    public TapiceriaCuero(Coche coche, double incremento) {
        super(coche);
        this.incremento = incremento;
    }
    public double getCoste(){
        return super.getCosteBase()*incremento+super.getCoste();
    }
    public String getInfo(){
        return super.getInfo()+" con Tapicería de cuero";
    }
}
