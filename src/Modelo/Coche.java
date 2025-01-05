package Modelo;

public class Coche extends Producto implements IdString{
    private String modelo;
    public Coche(String id, double PrecioBase, Integer Stock) {
        super(id, PrecioBase, Stock);
    }

    @Override
    public double getCoste() {
        return super.getCoste();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" del coche"; //en que seccion se encuentra y el Id
    }
    public double getCosteBase(){
        return super.getCoste();
    }

}
