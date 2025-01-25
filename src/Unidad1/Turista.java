package Unidad1;
public class Turista {
    private String nombreTuri;
    private String telefono;
    private String direccion;

    private Tarjeta tarjeta1;
    private ReservaHotel hotel;
    private BoletoAvion boleto;

    private Tarjeta tarjeta;
    public String getNombreTuri() {
        return nombreTuri;
    }

    public void setNombreTuri(String nombreTuri) {
        this.nombreTuri = nombreTuri;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Tarjeta getTarjeta1() {
        return tarjeta1;
    }

    public void setTarjeta1(Tarjeta tarjeta1) {
        this.tarjeta1 = tarjeta1;
    }

    public ReservaHotel getHotel() {
        return hotel;
    }

    public void setHotel(ReservaHotel hotel) {
        this.hotel = hotel;
    }

    public BoletoAvion getBoleto() {
        return boleto;
    }

    public void setBoleto(BoletoAvion boleto) {
        this.boleto = boleto;
    }

    public Turista() {
        this.nombreTuri = " ";
        this.telefono = " ";
        this.direccion = " ";
        this.tarjeta1 = new Tarjeta();
        this.hotel = new ReservaHotel();
        this.boleto = new BoletoAvion();
    }

    @Override
    public String toString() {
        return "Turista: " +"\n"+
                "Nombre: " + nombreTuri + "\n" +
                "Telefono: " + telefono + "\n" +
                "Dirección: " + direccion + "\n" +
                "" + hotel +"\n" +
                "" + boleto +"\n" +
                "Tarjeta: " + tarjeta1+"\n";
    }

}
