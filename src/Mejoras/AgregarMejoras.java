package Mejoras;

import EntradaSalida.MyInput;
import Modelo.Coche;

public class AgregarMejoras{
    Coche coche;
    public AgregarMejoras(Coche coche) {
        this.coche = coche;
    }
    //implementamos la parte de las mejoras
    private Coche agregarLlantasAleaccion(Coche coche){
        System.out.println("¿Desea que el coche tenga Llantas de Aleación? Responda con una \"s\" si quiere la habitación con este servicio" );
        String respuesta= MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) coche= new LlantasAleaccion(coche,0.05);
        return coche;
    }
    private Coche agregarCalefaccionAsiento(Coche coche){
        System.out.println("¿Desea que el coche tenga Calefaccion de Asiento? Responda con una \"s\" si quiere la habitación con este servicio" );
        String respuesta= MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) coche= new CalefaccionAsientos(coche,0.05);
        return coche;
    }
    private Coche agregarGPS(Coche coche){
        System.out.println("¿Desea que el coche tenga GPS? Responda con una \"s\" si quiere la habitación con este servicio" );
        String respuesta= MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) coche= new GPS(coche,0.05);
        return coche;
    }
    private Coche agregarTapiceriaCuero(Coche coche){
        System.out.println("¿Desea que el coche tenga Tapicería de cuero? Responda con una \"s\" si quiere la habitación con este servicio" );
        String respuesta= MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) coche= new TapiceriaCuero(coche,0.05);
        return coche;
    }
    public Coche agregarMejoraCoche(Coche coche){
        return agregarCalefaccionAsiento(agregarGPS(agregarLlantasAleaccion(agregarTapiceriaCuero(coche))));
    }
}
