package Modelo;

import java.util.ArrayList;

public class GestionId implements GestionableIdString {
    private ArrayList<IdString> lista;
    public void GestionListaIdStringReserva(){
        lista = new ArrayList<IdString>();
    }

    public void alta(IdString c){
        lista.add(c);
    }

    public void baja(IdString a){
        lista.remove(a);
    }
    public void mostrarTodos(){
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }


    //a partir de aqui no haría falta
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
