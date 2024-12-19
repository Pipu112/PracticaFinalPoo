package Menu;

import Modelo.Concesionario;
import Modelo.GestionableIdString;
import Modelo.IdString;

public class MenuGSecciones extends Menu{

    public MenuGSecciones(Concesionario c){
        super(c);
        //hacemos casting, almacenamos las secciones en la posicion 0 de la lista
        super.getGestionable(0);
    }
    public IdString recuperarIdSR(GestionableIdString g, String id){
        return  g.buscar(id);
    }
    public IdString recuperarIdSR(GestionableIdString g,  int i){
        return  g.recuperar(i);
    }

    public void altaSeccion(IdString id,String DescripcionSeccion){

    }
    @Override
    public void mostrarOpcion() {
        System.out.println("1. Gestion de opciones ");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("");
        System.out.println("Menú De Gestión De Secciones.");
        System.out.println("Seleccione una opción:");
        System.out.println("0. Guardar y salir del programa ");
        System.out.println("1. Dar de alta en una nueva seccion");
        System.out.println("2. Dar de baja una seccion ");
        System.out.println("3. Mostrar secciones ");
    }

    @Override
    public String seleccion(String s) {
        return "";
    }

}
