package Menu;

import EntradaSalida.MyInput;
import Modelo.*;

public class FactoryIdStringC {
    public String solicitarInfoS(String cad){
        System.out.println("Introduzca "+ cad);
        return MyInput.readString();
    }
    public double solicitarInfoD(String cad){
        System.out.println("Introduzca "+ cad);
        return MyInput.readDouble();
    }
    public IdString factory(Integer criterio, String id){
        switch(criterio){
            case 0: {
                String descripcion= solicitarInfoS(" la descripcion de la seccion ");
                return new Seccion(id, descripcion);}
            case 1: {
                String nombre = solicitarInfoS("el nombre del cliente");
                String telefono = solicitarInfoS("el teléfono del cliente");
                String recibirInfo = solicitarInfoS("una s si desea recibir informacion");
                return new Cliente(id,nombre,telefono,recibirInfo);}
            case 2: {
                String venta = solicitarInfoS("el nombre de la venta del coche");
                String datosVenta = solicitarInfoS("datos de la venta");
                return new VentaCoche(id,venta,datosVenta);
            }
            default: return null;

        }
    }
}
