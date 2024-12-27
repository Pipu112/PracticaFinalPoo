package Modelo;

import java.util.ArrayList;

public class Seccion implements IdString {
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
        return "El Id es: "+id+"\nLa descripcion de la seccion es: "+descripcionSeccion;
    }
    public void altaCoche(Producto coche){
        productos.add(coche);
    }
    public IdString recuperar(Integer i){
        if(i<productos.size())
            return productos.get(i);
        else return null;
    }
    public Coche buscarCoche(String id){
        for(Producto coche: productos){
            if(coche.getID().equals(id)) {
                return (Coche) coche;
            }
        }
        return null;
    }
    public int numeroElementos(){
        return productos.size();
    }


}
