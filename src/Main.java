import Modelo.Cliente;
import Modelo.Coche;
import Mejoras.LlantasAleaccion;
import Modelo.Producto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("yaris-2008",25000,25);
        coche.getCoste();
        System.out.println(coche.getID());
        coche.getInfo();

        Coche coche2 = new Coche("yaris-2008",1000,25);
        Coche cochecambiado = new LlantasAleaccion(coche2,0.05);
        System.out.println(cochecambiado.getCoste());
        System.out.println(cochecambiado.getInfo());
        cochecambiado = new LlantasAleaccion(cochecambiado, 0.05);
        System.out.println(cochecambiado.getCoste());
        System.out.println(cochecambiado.getInfo());


        Cliente cliente = new Cliente("560A","Benito Perez", "760","s");
        System.out.println(cliente.getInfo());

        Producto producto;
        producto = new Producto("hola",345,233);
    }
}