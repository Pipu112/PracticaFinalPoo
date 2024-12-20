package Menu;

import Modelo.Coche;
import Modelo.Producto;
import Modelo.Producto;

import java.util.ArrayList;

public class MenuGCoches {
    private ArrayList<Producto> productos = new ArrayList<>();

    MenuGCoches(){

    }

    //@Override
    public void mostrarOpcion() {

    }

    //@Override
    public void mostrarOpciones() {
        System.out.println("Menu de gestion de Coches: ");
        System.out.println("1. Alta de coche");
        System.out.println("2. Mostrar detalles de un coche");
        System.out.println("3. Aumentar Stock");
        System.out.println("4. Mostrar todos los coches de una seccion");
    }

    //@Override
    public String seleccion(String s) {
        switch ("s"){
            case "1":

        }
        return "";
    }
    public void altaCoche(Coche coche){
        productos.add(coche);
    }
   /* public Producto buscarCoche(){
        for(Producto c: productos){
            if(c.getID().equals(id)){
                return c;
            }
        }
        return null;
    }*/
    public void mostrarTodosLosProductos(){
        for(Producto c: productos){
            System.out.println(c);
        }
    }
}
