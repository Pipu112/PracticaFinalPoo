package Menu;

import EntradaSalida.MyInput;
import Mejoras.*;
import Modelo.*;
import java.time.LocalDate;

public class MenuGVentasIdString extends Menu{

    public MenuGVentasIdString(Concesionario c) {super(c);}

    @Override
    public void mostrarOpcion() {
        System.out.println("4. Gestion de ventas");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("");
        System.out.println("Menú De Gestión De Ventas.");
        System.out.println("Seleccione una opción:");
        System.out.println("0. Volver al menú principal ");
        System.out.println("1. Registrar una venta");
        System.out.println("2. Mostrar información de una venta");
        System.out.println("3. Mostrar información de todas las ventas de un cliente");
    }

    @Override
    public String seleccion(String s) {
        switch (s) {
            case "0":

                return "n";
            case "1":
                registrarVenta((GestionableIdString) getGestionable(2));
                return "s";
            case "2":
                MostrarInfoVenta((GestionableIdString) getGestionable(2));
                return "s";
            case "3":
                MostrarVentasCliente((GestionableIdString) getGestionable(2));
                return "s";
        }
        return "";
    }

    public void registrarVenta(GestionableIdString g){
        String idVenta = generaId(g);

        Coche coche = BuscarCoche(g);
        if(coche == null){System.out.println("El id del coche no existe");}
        else{
            String fe = solicitarInfoS("la fecha de la compra del coche");
            LocalDate fecha = crearFechaVenta();
            Cliente cliente = mostrarCliente(g);
            AgregarMejoras agregarMejora = new AgregarMejoras(coche);
            VentaCoche venta = new VentaCoche(idVenta,cliente,agregarMejora.agregarMejoraCoche(coche),fecha);
        }


    }

    public Coche BuscarCoche(GestionableIdString g){
        String idSeccion = solicitarInfoS("el id de la seccion de la que quiere comprar el coche");
        Seccion s = (Seccion) recuperarIdSR(g,idSeccion);
        String idCoche = solicitarInfoS("el id del coche que quiere comprar");
        for(int i=0; i<s.numeroElementos();i++){
            if(idCoche.equals(s.recuperar(i))){
                return (Coche) s.recuperar(i);
            }
        }
        return null;
    }
    public Cliente mostrarCliente(GestionableIdString g){
        String dni = solicitarInfoS("el dni del cliente a compar el coche");
        Cliente s =(Cliente) recuperarIdSR(g,dni);
        if(s == null){
            System.out.println("El cliente, no existe, si desea crearlo, vuelva al menú de clientes");
            return null;
        }
        else{
            return s;
        }
    }
    public LocalDate crearFechaVenta(){
        System.out.println("introduzca la fecha de compra del coche en formato AAAA-MM-DD");
        String f=MyInput.readString();
        try{
            return LocalDate.parse(f);
        } catch (Exception e) {
            System.out.println("Fecha no válida");
            return crearFechaVenta();
        }
    }
    //creo que aqui no me sumará un numero
    public String generaId(GestionableIdString g){
        VentaCoche v = (VentaCoche)recuperarIdSR(g,g.numeroElementos());
        String num = v.getUltimoNumeroId().toString();
        num += 1;
        while(num.length()<9){
            num="0"+num;
        }
        return num;
    }


    //ya está bien
    public void MostrarInfoVenta(GestionableIdString g){
        String idVenta = solicitarInfoS("el id del venta");
        Venta v = (Venta) recuperarIdSR(g,idVenta);
        v.getInfo();
    }
    public void MostrarVentasCliente(GestionableIdString g){
        String dni = solicitarInfoS("el DNI del cliente");
        Cliente c = (Cliente) recuperarIdSR((GestionableIdString) getGestionable(2),dni);
        if(c == null){
            System.out.println("El cliente no existe");
        }
        else{
            mostrarVentasCliente(c,g);
        }
    }
    public void mostrarVentasCliente(Cliente c,GestionableIdString g){
        for(int i = 0; i <g.numeroElementos(); i++){
            Venta venta = (Venta) g;
            Cliente clienteVenta = venta.getCliente();
            if(clienteVenta.getID().equals(c.getID())){
                System.out.println("\n"+venta.getInfo());
            }
        }
    }
}
