package Menu;

import EntradaSalida.MyInput;
import Modelo.*;

public abstract class Menu {
    private Concesionario c;
    public Menu(Concesionario c) {this.c = c;}
    public Gestionable<?,?,?> getGestionable(int indice){
        return  c.recuperarGestionable(indice);
    }
    public void  ejecutar(){
        String respuesta="";
        do{
            respuesta= ejecutarOpciones();
        }while(respuesta.equals("s"));
    }

    public String ejecutarOpciones(){
        mostrarOpciones();
        String respuesta= MyInput.readString();
        respuesta=seleccion(respuesta);
        if(respuesta.equals("")){
            System.out.println("Opción no válida. Vuelva a intentarlo."); return "s";}
        else return respuesta;
    }
    public String solicitarInfoS(String cad){
        System.out.println("Introduzca "+ cad);
        return MyInput.readString();
    }
    public double solicitarInfoD(String cad){
        System.out.println("Introduzca "+ cad);
        return MyInput.readDouble();
    }
    public int solicitarInfoI(String cad){
        System.out.println("Introduzca "+ cad);
        return MyInput.readInt();
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
    public IdString recuperarIdSR(GestionableIdString g, String id){return g.buscar(id);}
    public IdString recuperarIdSR(GestionableIdString g,  int i){return  g.recuperar(i);}

    public abstract void mostrarOpcion();
    public abstract void mostrarOpciones();
    public abstract String seleccion(String s);
}
