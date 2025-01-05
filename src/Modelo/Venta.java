package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Venta implements IdString, Serializable {
    private String id;
    private Cliente cliente;
    private LocalDate fechaI;

    public Venta(String id, Cliente cliente, LocalDate fechaI) {
        this.id = id;
        this.cliente = cliente;
        this.fechaI = fechaI;
    }
    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getInfo() {
        return "el id de la venta es: "+id+"Los datos del cliente son: " + cliente.getInfo()+" \nla fecha de venta es "+fechaI;
    }
    public LocalDate getFecha(){return fechaI;}
    public Cliente getCliente(){return cliente;}
    public abstract double getCosteProducto();
    public  abstract void agregar(Venta r);
    public  abstract void eliminar (Venta r);
    public  abstract Venta recuperarVenta(String id);

}
