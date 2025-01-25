package Unidad1;
import java.util.Scanner;
import Unidad1.Tarjeta;
public class ReservaHotel {
    private String nombreHuespe;
    private String numHabitac;
    private double costoHabita;
    private String diasHospe;
    private final Tarjeta tarjeta;
    public ReservaHotel() {
        nombreHuespe = " ";
        numHabitac = " ";
        costoHabita = 0;
        diasHospe = " ";
        this.tarjeta = new Tarjeta();
    }

    public void setNombreHuespe(String nombreHuespe) {
        this.nombreHuespe = nombreHuespe;
    }
    public void setNumHabitac(String numHabitac) {
        this.numHabitac = numHabitac;
    }
    public void setCostoHabita(double costoHabita) {
        this.costoHabita = costoHabita;
    }

    public String getDiasHospe() {
        return diasHospe;
    }

    public void setDiasHospe(String diasHospe) {
        this.diasHospe = diasHospe;
    }

    public double Reservacion() {
        Scanner leer = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el número de habitación: ");
        numHabitac = leer.nextLine();
        setNumHabitac(numHabitac);
        System.out.println("Dias de hospedaje: ");
        diasHospe = leer.nextLine();
        setDiasHospe(diasHospe);
        costoHabita = 500 * Integer.parseInt(diasHospe);
        System.out.println("El costo de la habitación sera de: " + costoHabita);
        monto = costoHabita;
        return monto;
    }

    public void CancelarReserva() {

        System.out.println("Reservación cancelada para el huesped: " + nombreHuespe);
        nombreHuespe = " ";
        numHabitac = " ";
        costoHabita = 0;
        diasHospe = " ";
    }

    public String toString() {
        return "\n"+"Reservación de hotel: " +"\n"+
                "Nombre del huesped: " + nombreHuespe + "\n"+
                "Numero de Habitación: " + numHabitac +"\n"+
                "Costo de habitación: " + costoHabita +"\n"+
                "Dias de hospedaje: " + diasHospe+"\n";
    }

    public double getCostoHabita() {
        return costoHabita;
    }
}

