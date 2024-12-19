package Mejoras;

import Modelo.Coche;

public class LlantasAleaccion extends Mejora {
    private double coste;
    public LlantasAleaccion(Coche coche, double coste) {
        super(coche);
        this.coste = coste;
    }
    public double getCoste(){
        return super.getCosteBase()*coste + super.getCoste();
    }
    public String getInfo(){
        return super.getInfo()+" con Llantas de Aleaccion";
    }
}
