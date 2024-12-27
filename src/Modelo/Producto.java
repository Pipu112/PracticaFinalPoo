package Modelo;

public class Producto implements IdString{
    private String id;
    private double PrecioBase;
    private Integer Stock;

    public Producto(String id, double PrecioBase, Integer Stock) {
        this.id = id;
        this.PrecioBase = PrecioBase;
        if(verificarStock(Stock)){
            this.Stock = Stock;
        }
    }
    public boolean verificarStock(Integer Stock) {
        while(Stock <0){
            System.out.println("El stock intoducido es incorrecto, debe ser mayor a cero");
            return false;
        }
        return true;
    }

    @Override
    public String getID() {
        return "Tiene un id : " + id;
    }

    @Override
    public String getInfo() {
        return "El id es: "+id+" el precio base es "+PrecioBase+" ahora en estock hay "+Stock;
        //falta en que seccion se encuentra y el Id
    }
    public double getCoste(){
        return PrecioBase;
    }
    public void aumentarStock(Integer i){
        Stock += i;
    }
}
