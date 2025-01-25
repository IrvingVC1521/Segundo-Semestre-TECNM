package Unidad1;
import Unidad1.Tarjeta;
import java.util.Scanner;
public class BoletoAvion {
    private String nombreCliente;
    private String lugarSalida;
    private String destino;
    private String numeroAsiento;
    private double costoVuelo;
    private String fechaVuelo;
    Tarjeta tarjeta;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public double getCostoVuelo() {
        return costoVuelo;
    }

    public void setCostoVuelo(double costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public BoletoAvion() {
        this.nombreCliente = "";
        this.lugarSalida = "";
        this.destino = "";
        this.numeroAsiento = "";
        this.costoVuelo = 1200;
        this.fechaVuelo = "";
        this.tarjeta = new Tarjeta();
    }
    public BoletoAvion(String nombreCliente, String lugarSalida, String destino, String numeroAsiento, double costoVuelo, String fechaVuelo, Tarjeta tarjeta) {
        this.nombreCliente = nombreCliente;
        this.lugarSalida = lugarSalida;
        this.destino = destino;
        this.numeroAsiento = numeroAsiento;
        this.costoVuelo = costoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.tarjeta = tarjeta;
    }

    public double reservarBoleto() {
        Scanner leer = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el lugar de salida");
        lugarSalida = leer.nextLine();
        setLugarSalida(lugarSalida);
        System.out.println("Ingrese el lugar de destino");
        destino = leer.nextLine();
        setDestino(destino);
        System.out.println("Ingrese el numero de asiento que desea, " +
                " va de 1 a 30 y una letra, cada fila tendrá las letras de la A a la F, por ejemplo 5C.");
        numeroAsiento = leer.nextLine();
        setNumeroAsiento(numeroAsiento);
        System.out.println("Ingresa la fecha del vuelo");
        setFechaVuelo(fechaVuelo);
        fechaVuelo = leer.nextLine();
        costoVuelo = 1200;
        System.out.println("El costo de boleto será de: " + costoVuelo);
        // Solo registra la compra una vez
        monto = costoVuelo;
        return monto;
    }

    public void cancelarBoleto() {


        String cancelar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Has elegido la opción de cancelar boleto," +
                " estas seguro que quieres cancelar el boleto? escribe Si o No");
        cancelar = leer.nextLine();
        try {
            if (cancelar.equalsIgnoreCase("si")) {
                System.out.println("Has cancelado tu boleto de avion");

                nombreCliente = "";
                lugarSalida = "";
                destino = "";
                numeroAsiento = "";
                costoVuelo = 0;
                fechaVuelo = "";
            } else if (cancelar.equalsIgnoreCase("no")) {
                System.out.println("Puedes seguir con tu reservación");
            } else {
                throw new IllegalArgumentException("Respuesta inválida, debe ser Si o No");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }


    @Override
    public String toString() {
        return "Boleto de avion: " + "\n" +
                "Nombre del cliente: " + nombreCliente + "\n" +
                "lugar de salida: " + lugarSalida + "\n" +
                "Destino: " + destino + "\n" +
                "Numero de asiento: " + numeroAsiento + "\n" +
                "Costo del vuelo: " + costoVuelo + "\n" +
                "Fecha de vuelo: " + fechaVuelo + "\n";
    }
}


