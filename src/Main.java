import EntradaSalida.MyInput;
import Menu.MenuGCoches;
import Menu.MenuGSecciones;
import Menu.MenuPrincipal;
import Modelo.Cliente;
import Modelo.Coche;
import Mejoras.LlantasAleaccion;
import Modelo.Concesionario;
import Modelo.Producto;
import Modelo.GestionId;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Concesionario c = new Concesionario();
        for(int i=0;i<3;i++)
            c.agregarGestionable(new GestionId());

        MenuPrincipal mp= new MenuPrincipal(c);
        mp.agregarMenu(new MenuGSecciones(c));
        mp.agregarMenu(new MenuGCoches(c));
        //mp.agregarMenu(new MenuGestionIdStringReserva(c, 1, MyInput.leeFichero("textoGCliente.txt"), new FactoryIdStringReserva()));
        //mp.agregarMenu(new MenuGestionReserva(c));
        //mp.agregarMenu(new MenuGestionEconomica(c));
        mp.ejecutar();
        //MyInput.serialize(h, "fichero.dat");
    }
}