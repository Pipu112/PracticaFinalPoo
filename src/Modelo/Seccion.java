package Modelo;

import java.util.ArrayList;

public class Seccion implements IdString{
    private String id;
    private String descripcionSeccion;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Seccion(String id, String descripcionSeccion) {}
    @Override
    public String getID() {
        return "El Id es: "+id;
    }

    @Override
    public String getInfo() {
        return "El Id es: "+id+" la descripcion de la seccion es: "+descripcionSeccion;
    }
    public void altaCoche(Coche coche){
        productos.add(coche);
    }
    public Producto buscarCoche(){
        for(Producto c: productos){
            if(c.getID().equals(id)){
                return c;
            }
        }
        return null;
    }
    public void mostrarTodosLosProductos(){
        for(Producto c: productos){
            System.out.println(c);
        }
    }

}
