package Modelo;

import Mejoras.Mejora;

import java.time.LocalDate;
import java.util.ArrayList;

public class VentaCoche extends Venta {
    private Mejora mejora;
    private Coche coche;
    private ArrayList<Venta> ventas= new ArrayList<Venta>();
    //la venta de coche tiene que tener como entrada id venta, datos coche, mejoras,fecha venta
    public VentaCoche(String id, Cliente cliente, Coche coche,LocalDate fechaI) {
        super(id, cliente, fechaI);
        this.coche = coche;
    }
    public Integer getUltimoNumeroId(){
        if(ventas.isEmpty())
            return 1;
        else{
            Venta r=ventas.get(ventas.size()-1);
            int i= r.getID().lastIndexOf("R");
            return Integer.parseInt(r.getID().substring(i+2))+1;}
    }
    //mejoras aplicadas
    @Override
    public String getInfo() {
        return super.getInfo()+" el coste final es: "+coche.getCoste();
    }
    @Override
    public double getCosteProducto(){
        return coche.getCoste();
        //tengo que poner el coste de la decoracion del coche, no solo del coche
        //no se hacerlo
    }
    @Override
    public void agregar(Venta r){
        ventas.add(r);
    }
    @Override
    public void eliminar (Venta r){
        if (ventas.contains(r)) {
            ventas.remove(r);
        } else for (Venta v : ventas)
            r.eliminar(r);
    }
    @Override
    public  Venta recuperarVenta(String id){
        for(int i=0;i<ventas.size();i++){
            if(id.equals(ventas.get(i).getID())){
                return ventas.get(i);
            }
        }
        return null;
    }
    public double precioFinal(){
        double precioIVA = coche.getCoste()*0.21;
        return coche.getCoste()*precioIVA;
    }

}
