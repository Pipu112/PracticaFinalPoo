package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Concesionario implements Serializable {
    private ArrayList<Gestionable<?,?,?>> lista;

    public Concesionario(){
        lista=new ArrayList<>();
    }
    public void agregarGestionable(Gestionable<?,?,?> g){
        lista.add(g);
    }
    public Gestionable<?,?,?> recuperarGestionable(int i){
        return lista.get(i);
    }
}
