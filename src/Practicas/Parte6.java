package Practicas;

public class Parte6 {
    public static void main(String[] args) {
        CuatroPuntos puntoo = new CuatroPuntos(4,3);
        CuatroPuntos punto0 = new CuatroPuntos(0,0);
        double Distanciaa = puntoo.DistanciaEntreDosPuntos(puntoo,punto0);
        System.out.println("La distancia desde {4,3} al punto de origen es: " +Distanciaa);
    }
}
