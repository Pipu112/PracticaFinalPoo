package Modelo;

import java.time.LocalDate;

public abstract class Venta implements IdString{
    private String id;
    private Cliente cliente;
    private LocalDate fechaI;

    public Venta(String id, String datosProducto, String dniCliente) {}
    @Override
    public String getID() {
        return "El ID del venta es " + id;
    }

    @Override
    public String getInfo() {
        return "Los datos del cliente son: " + cliente.getInfo()+" la fecha de venta es "+fechaI;
    }
    public LocalDate getFecha(){return fechaI;}

    public abstract double getCosteProducto();
    //public  abstract void agregar(Producto r);
    //public  abstract void eliminar (Producto r);
    //public  abstract Producto recuperarReserva(String id);

}
