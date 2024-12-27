package Modelo;

import java.util.ArrayList;

public class GestionId implements GestionableIdString {
    private ArrayList<IdString> lista;

    public GestionId(){
        lista = new ArrayList<IdString>();
    }

    public void alta(IdString c){
        lista.add(c);
    }

    public void baja(IdString a){
        lista.remove(a);
    }

    public IdString buscar(String id){
        for(IdString c: lista){
            if(c.getID().equals(id)){
                return c;
            }
        }
        return null;
    }
    public IdString recuperar(Integer i){
        if(i<lista.size())
            return lista.get(i);
        else return null;
    }
    public int numeroElementos(){
        return lista.size();
    }
}
