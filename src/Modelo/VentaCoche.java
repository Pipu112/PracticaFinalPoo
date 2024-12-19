package Modelo;

import Mejoras.Mejora;

import java.time.LocalDate;
import java.util.ArrayList;

public class VentaCoche extends Venta {
    private Mejora mejora;
    private String id;
    private String datosProducto;
    private Coche coche;
    private LocalDate fechaI;
    private ArrayList<Venta> ventas= new ArrayList<Venta>();
    //la venta de coche tiene que tener como entrada id venta, datos coche, mejoras,fecha venta
    public VentaCoche(String id, String datosProducto, String dniCliente) {
        super(id, datosProducto, dniCliente);
    }
    //mejoras aplicadas
    //mostarar inormacion de una venta
    @Override
    public String getInfo() {
        return super.getInfo();
    }
    @Override
    public double getCosteProducto(){
        return coche.getCoste();
        //tengo que poner el coste de la decoracion del coche, no solo del coche
        //no se hacerlo
    }

}
