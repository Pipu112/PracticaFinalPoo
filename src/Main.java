import EntradaSalida.MyInput;
import Menu.*;
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

        Concesionario c= MyInput.deserialize("ficheroConcesionario.dat");
        if(c==null) {
            c = new Concesionario();
            for(int i=0;i<3;i++)
                c.agregarGestionable(new GestionId());
        }
        MenuPrincipal mp= new MenuPrincipal(c);
        mp.agregarMenu(new MenuGSecciones(c));
        mp.agregarMenu(new MenuGCoches(c));
        mp.agregarMenu(new MenuGClientes(c));
        mp.agregarMenu(new MenuGVentasIdString(c));
        mp.ejecutar();
        MyInput.serialize(c, "ficheroConcesionario.dat");
    }
}