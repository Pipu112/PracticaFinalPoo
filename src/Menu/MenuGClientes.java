package Menu;

import Modelo.*;

public class MenuGClientes extends Menu{
    public MenuGClientes(Concesionario c) {super(c);}

    @Override
    public void mostrarOpcion() {
        System.out.println("3. Gestión de clientes");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("");
        System.out.println("Menú De Gestión De Clientes.");
        System.out.println("Seleccione una opción:");
        System.out.println("0. Volver al menú principal ");
        System.out.println("1. Dar de alta a un nuevo cliente");
        System.out.println("2. Mostrar info de todos los clientes");
        System.out.println("3. Mostrar info de un cliente");
    }

    @Override
    public String seleccion(String s) {
        switch(s){
            case "0":
                return "n";
            case "1":
                agregar((GestionableIdString) getGestionable(1));
                return "s";
            case "2":
                mostrar((GestionableIdString) getGestionable(1));
                return "s";
            case "3":
                MostrarDetallesCliente((GestionableIdString) getGestionable(1));
                return "s";

        }
        return "";
    }

    public void agregar(GestionableIdString g){
        String id=solicitarInfoS("su DNI"); //pone en total Introduzca la seccion
        IdString o= recuperarIdSR(g, id);
        if (o==null){
            String nombre = solicitarInfoS("sus nombres y apellidos");
            String telefono = solicitarInfoS("su teléfono");
            String recibirInfo = solicitarInfoS("si desea recibir informacion(En caso afirmativo, introducir una s)");
            Cliente s = new Cliente(id, nombre,telefono,recibirInfo);
            s.DeseaRecibirInfo(recibirInfo);
            g.alta(s);
        }
        else System.out.println("Ya existe una seccion con ese id");
    }

    public void MostrarDetallesCliente(GestionableIdString g){
        String id = solicitarInfoS("el DNI del cliente"); //pone en total Introduzca la seccion
        Cliente cliente = (Cliente) recuperarIdSR(g,id);
        if (cliente != null){System.out.println(cliente.getInfo());}
        else{System.out.println("No existe ese coche");}
    }

}
