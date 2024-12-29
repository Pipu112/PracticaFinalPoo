package Menu;

import Modelo.*;
import Modelo.Producto;

import java.util.ArrayList;

public class MenuGCoches extends MenuPrincipal {
    Seccion seccion;

    public MenuGCoches(Concesionario c){
        super(c);
    }

    public Seccion buscarSeccion(){
        String idSeccion = solicitarInfoS("el id de la seccion quieres gestionar los coches: ");
        Seccion seccionARecuperar = (Seccion) recuperarIdSR((GestionableIdString) getGestionable(0),idSeccion);
        if(seccionARecuperar == null){
            System.out.println("La seccion no existe");
            return null;
        }
        else{return (seccionARecuperar);}
    }
    public IdString recuperarIdSR(GestionableIdString g, String id){return g.buscar(id);}

    public Coche idCoche(){
        String id = solicitarInfoS("el id del coche"); //pone en total Introduzca la seccion
        Coche coche = seccion.buscarCoche(id);
        return coche;
    }

    public void agregar(){
        String id = solicitarInfoS("el id del coche"); //pone en total Introduzca la seccion
        Coche coche = seccion.buscarCoche(id);
        if (coche == null){
            double PrecioBase = solicitarInfoD("el precio de la seccion");
            Integer Stock = solicitarInfoI("el stock");
            Coche co = new Coche(id, PrecioBase,Stock);
            seccion.altaCoche(co);
        }
        else System.out.println("Ya existe una seccion con ese id");
    }

    public void mostrarTodosLosCoches(){
        for(int i = 0; i< seccion.numeroElementos(); i++){
            Coche coche = (Coche) seccion.recuperar(i);
            System.out.println(coche.getInfo());
        }
    }
    @Override
    public void mostrarOpcion() {
        System.out.println("2.Gestión de coches de una seccion");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Menu de gestion de Coches: ");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("1. Alta de coche");
        System.out.println("2. Mostrar detalles de un coche");
        System.out.println("3. Aumentar Stock");
        System.out.println("4. Mostrar todos los coches de una seccion");
    }

    @Override
    public String seleccion(String s) {
        switch (s){
            case "0":
                return "n";
            case "1":
                agregar();
                return "s";
            case "2":
                MostrarDetallesCoche();
                return "s";
            case "3":
                aumentarStockCoche();
                return "s";
            case "4":
                mostrarTodosLosCoches();
                return "s";
        }
        return "";
    }

    public void MostrarDetallesCoche(){
        Coche coche = idCoche();
        if (coche != null){System.out.println(coche.getInfo());}
        else{System.out.println("No existe ese coche");}
    }

    public void aumentarStockCoche(){
        Coche coche = idCoche();
        Integer aumento = solicitarInfoI("la cantidad de stock que quiera aumentar");
        if(aumento > 0){
            coche.aumentarStock(aumento);
            System.out.println(coche.getInfo());
        }
        else{System.out.println("Ese aumento no es válido, debe ser mayor que 0");}
    }
    /*@Override
    public void ejecutar(){
        seccion = buscarSeccion();
        if(seccion != null){super.ejecutar();}
        else{System.out.println("No existe el seccion");}
    }*/
}
