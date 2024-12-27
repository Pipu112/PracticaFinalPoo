package Menu;

import Modelo.Concesionario;
import Modelo.GestionableIdString;
import Modelo.IdString;
import Modelo.Seccion;

public class MenuGSecciones extends Menu{

    public MenuGSecciones(Concesionario c) {
        super(c);
    }
    public IdString recuperarIdSR(GestionableIdString g, String id){return g.buscar(id);}
    public IdString recuperarIdSR(GestionableIdString g,  int i){return  g.recuperar(i);}

    public void agregar(GestionableIdString g){
        String id=solicitarInfoS("la id de la seccion"); //pone en total Introduzca la seccion
        IdString o= recuperarIdSR(g, id);
        if (o==null){
            String descripcion = solicitarInfoS("la descripcion de la seccion");
            Seccion s = new Seccion(id, descripcion);
            g.alta(s);
        }
        else System.out.println("Ya existe una seccion con ese id");
    }

    public void bajaSeccion(GestionableIdString g,String id){
        IdString o= recuperarIdSR(g, id);
        //no funciona que te devuelva la seccion
        if(o != null){
            g.baja(o);
            System.out.println("La seccion "+(Seccion)o+" se ha eliminado");
        }
        else{
            System.out.println("No se ha podido dar de baja esa seccion ya que no existe");
        }
    }
    public void eliminar(GestionableIdString g){
        String id=solicitarInfoS("El id que desea eliminar ");
        bajaSeccion(g, id);
    }

    public void mostrar(GestionableIdString g){
        IdString c;
        if(g.numeroElementos() == 0){
            System.out.println("No hay secciones añadidas");
        }
        else {
            for (int i = 0; i < g.numeroElementos(); i++) {
                c = recuperarIdSR(g, i);
                System.out.println(c.getInfo());
            }
        }
    }

    @Override
    public void mostrarOpcion() {
        System.out.println("1. Gestion de opciones de Seccion ");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("");
        System.out.println("Menú De Gestión De Secciones.");
        System.out.println("Seleccione una opción:");
        System.out.println("0. Volver al menú principal ");
        System.out.println("1. Dar de alta en una nueva seccion");
        System.out.println("2. Dar de baja una seccion ");
        System.out.println("3. Mostrar secciones ");
    }

    @Override
    public String seleccion(String s) {
        switch(s) {
            case "0": {
                return "n";
            }
            case "1": {
                agregar((GestionableIdString) getGestionable(0));

                return "s";
            }
            case "2": {
                //dar de baja
                eliminar((GestionableIdString) getGestionable(0));
                return "s";
            }
            case "3": {
                mostrar((GestionableIdString) getGestionable(0));
                return "s";
            }
        } return "";
    }
}
