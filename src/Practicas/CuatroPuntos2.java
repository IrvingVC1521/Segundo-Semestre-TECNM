package Practicas;

public class CuatroPuntos2 {
    public static void main(String[] args) {
        double X;
        double Y;
        double Distancia;
        CuatroPuntos punto = new CuatroPuntos();
        CuatroPuntos punto1 = new CuatroPuntos();
        CuatroPuntos punto2 = new CuatroPuntos(5,3);
        CuatroPuntos punto3 = new CuatroPuntos(2,-1);
        CuatroPuntos punto4 = new CuatroPuntos((punto2.getPuntox() + punto3.getPuntox()) / 2,
                (punto2.getPuntoY() + punto3.getPuntoY()) / 2);
        //Imprmir todo
        System.out.println("El punto 1 es: " + punto1.toString());
        System.out.println("El punto 2 es: " + punto2.toString());
        System.out.println("El punto 3 es: " + punto3.toString());
        System.out.println("El punto 4 es: " + punto4.toString());
        //Distancia entre los puntos 2 y 3
          Distancia = punto.DistanciaEntreDosPuntos(punto2, punto3);
        System.out.println("La distancia entre los puntos 2 y 3 es: " + Distancia);
    }
    }

