package Modelo;

import java.util.ArrayList;

public class Seccion implements IdString{
    private String id;
    private String descripcionSeccion;
    private ArrayList<Producto> productos;

    public Seccion(String id, String descripcionSeccion) {
        this.id = id;
        this.descripcionSeccion = descripcionSeccion;
        productos = new ArrayList<>();
    }
    @Override
    public String getID() {
        return "El Id es: "+id;
    }

    @Override
    public String getInfo() {
        return "El Id es: "+id+" la descripcion de la seccion es: "+descripcionSeccion;
    }


}
