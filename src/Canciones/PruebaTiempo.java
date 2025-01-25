package Canciones;

public class PruebaTiempo {
    public static void main(String[] args) {
     Tiempo segundos2 = new Tiempo();
     segundos2.setSegundos(5.3);
        System.out.println("El numero de segundos es:");
        System.out.println(segundos2.getSegundos());
        segundos2.setSegundos(415.27);
        System.out.println(segundos2.getSegundos());
    }
}
