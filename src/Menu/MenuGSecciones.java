package Menu;

import Modelo.Concesionario;
import Modelo.GestionableIdString;
import Modelo.IdString;

import java.util.ArrayList;

public class MenuGSecciones extends Menu{
    private int criterio;
    private ArrayList<String> texto;
    private FactoryIdStringC f;
    public MenuGSecciones(Concesionario c, int criterio, ArrayList<String> texto, FactoryIdStringC f) {
        super(c);
        this.texto = texto;
        this.criterio = criterio;
        this.f = f;
    }
    public IdString recuperarIdSR(GestionableIdString g, String id){
        return  g.buscar(id);
    }
    public IdString recuperarIdSR(GestionableIdString g,  int i){
        return  g.recuperar(i);
    }

    public void agregar(GestionableIdString g){
        String id=solicitarInfoS("la id de la seccion"); //pone en total Introduzca la seccion
        String descripcion = solicitarInfoS("la descripcion de la seccion");
        IdString o= recuperarIdSR(g, id);
        if (o==null){
            o=f.factory(criterio,id);
            g.alta(o);}
        else System.out.println("Ya existe "+texto.get(0)+" con ese "+texto.get(1));
    }

    public void mostrar(GestionableIdString g){
        IdString c;
        for(int i = 0; i< g.numeroElementos(); i++){
            c= recuperarIdSR(g, i);
            System.out.println(c.getInfo());
        }
    }

    @Override
    public void mostrarOpcion() {
        System.out.println("1. Gestion de opciones ");
    }
    public void eliminar(GestionableIdString g){
        String id=solicitarInfoS("El id que desea eliminar ");

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
                agregar((GestionableIdString) getGestionable(criterio));
                return "s";
            }
            case "2": {
                //dar de baja

            }
            case "3": {
                mostrar((GestionableIdString) getGestionable(criterio));
                return "s";
            }
        } return "";
    }

}
