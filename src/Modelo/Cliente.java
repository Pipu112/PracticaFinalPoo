package Modelo;

public class Cliente implements IdString {
    private String dni;
    private String nombre;
    private String telefono;
    private boolean recibirInfo;

    public Cliente(String DNI, String Nombre, String Telefono, String RecibirInfo) {
        this.dni = DNI;
        this.nombre = Nombre;
        this.telefono = Telefono;
        this.recibirInfo = DeseaRecibirInfo(RecibirInfo);
    }
    @Override
    public String getID(){return this.dni;}

    @Override
    public String getInfo() {
        return "DNI: "+ dni + " nombre: "+ nombre+" teléfono: "+telefono+" desea recibir informacion "+recibirInfo;
    }
    public boolean DeseaRecibirInfo(String Recibir){
        if (Recibir.equals("s")){
            return true;
        }
        else{return false;}
    }

}
