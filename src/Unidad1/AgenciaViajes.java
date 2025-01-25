package Unidad1;
import java.util.Scanner;
public class AgenciaViajes {
    public static void main(String[] args) {
        Turista turista = new Turista();
        double monto = 0.0;

        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el nombre del turista: ");
        turista.setNombreTuri(leer.nextLine());

        turista.getTarjeta1().setNombre(turista.getNombreTuri());
        System.out.println("Ingrese el telefono del turista: ");
        turista.setTelefono(leer.nextLine());
        System.out.println("Ingrese la dirección del turista: ");
        turista.setDireccion(leer.nextLine());
        System.out.println("Saldo en tarjeta: "+turista.getTarjeta1().getSaldoTarj());
        do {
            menu();
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Reservar boleto de avion");
                    System.out.println("Reservando para: " + turista.getNombreTuri());
                    turista.getBoleto().setNombreCliente(turista.getNombreTuri());
                    double costoBoleto = turista.getBoleto().reservarBoleto(); // Obtener el costo real del boleto
                    turista.getTarjeta1().registrarCompra(costoBoleto);
                    break;
                case 2:
                    System.out.println("Reservar hotel");
                    System.out.println("Reservando para: "+turista.getNombreTuri());
                    turista.getHotel().setNombreHuespe(turista.getNombreTuri());
                    costoBoleto=turista.getHotel().Reservacion();
                    turista.getTarjeta1().registrarCompra(costoBoleto);
                    break;
                case 3:
                    System.out.println("Cancelar boleto de avion");
                    double cancelar = turista.getBoleto().getCostoVuelo();
                    turista.getBoleto().cancelarBoleto();
                    turista.getTarjeta1().abonar(cancelar);
                    break;
                case 4:
                    cancelar = turista.getHotel().getCostoHabita();
                    turista.getHotel().CancelarReserva();
                    turista.getTarjeta1().abonar(cancelar);
                    break;
                case 5:
                    System.out.println("Ver información del turista");
                    System.out.println(turista.toString());
                    break;
                case 6:
                    System.out.println("Gracias por su preferencia");
                    break;

            }

        } while (opcion != 6);

    }

    public static void menu() {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1.Reservar boleto de avion");
        System.out.println("2.Reservar hotel");
        System.out.println("3.Cancelar boleto de avion ");
        System.out.println("4.Cancelar hotel");
        System.out.println("5.Ver informacion del turista");
        System.out.println("6.Salir");
}

}