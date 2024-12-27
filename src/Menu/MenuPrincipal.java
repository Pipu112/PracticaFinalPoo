package Menu;

import EntradaSalida.MyInput;
import Modelo.Concesionario;

import java.util.ArrayList;

public class MenuPrincipal extends Menu{
    private ArrayList<Menu> menus;

    public MenuPrincipal(Concesionario c) {
        super(c);
        menus = new ArrayList<Menu>();
    }

    public void agregarMenu(Menu m){
        menus.add(m);
    }

    public void mostrarOpcion(){
        System.out.println("");
        System.out.println("Menú Principal.");
        System.out.println("Seleccione una opción:");
        System.out.println("0. Guardar y salir del programa ");
    }
    public void mostrarOpciones(){
        mostrarOpcion();
        for (Menu m:menus)
            m.mostrarOpcion();
    }

    public String seleccion(String s){return null;}

    @Override
    public String ejecutarOpciones(){
        mostrarOpciones();
        String s= MyInput.readString();
        int i;
        try{
            i= Integer.parseInt(s);
        }catch(NumberFormatException ex){
            System.out.println("La entrada no tiene formato de número. Inténtelo de nuevo");
            return "s";
        }
        if((i>0)&&(i<=menus.size())){
            menus.get(i-1).ejecutar();
            return "s";}
        else if ((i<0)||(i>menus.size())){
            System.out.println("Opción no válida. Inténtelo de nuevo");
            return "s";}
        else
            return "n";
    }
}
