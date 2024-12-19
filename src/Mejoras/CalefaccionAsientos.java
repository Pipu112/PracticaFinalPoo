package Mejoras;

import Modelo.Coche;

public class CalefaccionAsientos extends Mejora {
    private double incremento;
    public CalefaccionAsientos(Coche coche, double incremento) {
        super(coche);
        this.incremento = incremento;
    }
    public double getCoste(){
        return super.getCosteBase()*incremento+super.getCoste();
    }
    public String getInfo(){
        return super.getInfo()+" con Calefacción en asientos y el volante";
    }
}
