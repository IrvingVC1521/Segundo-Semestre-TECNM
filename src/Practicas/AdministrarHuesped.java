package Practicas;
import java.util.Scanner;
public class AdministrarHuesped {

    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int opcion;
        int datos = 0;
        Huesped huesped1 = new Huesped();
        huesped1.setNombre("Irving Manuel Vargas Cadena");
        huesped1.setAlimentosyBebidas(0);
        huesped1.setCostoHabitacion(7000);
        huesped1.setLlamadas(0);
        huesped1.setDiasHospedaje(7);
        huesped1.setNumeroHab(12);

        do {
            Datos(datos);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    huesped1.agregarLlamadas();
                    break;
                case 2:
                    huesped1.agregarConsumoAYB();
                       break;
                case 3:
                    System.out.println("El consumo de tus alimentos y bebidas es: " +huesped1.getAlimentosyBebidas());
                          break;
                case 4:
                    System.out.println("El monto  pagar por tus llamadas es: " +huesped1.getLlamadas());
                    break;
                case 5:
                    huesped1.totalAPagar();
                     break;
                case 6:
                    System.out.println("Tu nombre es: " +huesped1.getNombre());
                    System.out.println("Tu numero de habitacion es: " +huesped1.getNumeroHab());
                    System.out.println("Tus dias de hospedejas son: "+huesped1.getDiasHospedaje());
                  break;
                case 7:
                    System.out.println("Gracias por visitar hoteles Tec COCO");
            }
        } while (opcion >0 && opcion<7);


        }
    public static int Datos(int datos){
        System.out.println("****************** Menu ******************");
        System.out.println("Para registrar una llamada presione 1");
        System.out.println("Para registrar su consumo de alimentos y bebidas presione: 2");
        System.out.println("Para consultar su consumo de alimentos y bebidas presione: 3" );
        System.out.println("Para consultar su monto de llamadas presione: 4");
        System.out.println("Para consultar el total a pagar presione: 5");
        System.out.println("Para consultar sus datos presione: 6");
        System.out.println("Para salir presione: 7" );
         return datos;
    }
}
