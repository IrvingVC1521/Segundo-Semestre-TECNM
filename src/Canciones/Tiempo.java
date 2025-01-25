package Canciones;

import java.util.Scanner;

public class Tiempo {
    public double segundos;
    public void setSegundos(double segundos){
        this.segundos = segundos;
    }
    public double getSegundos(){
        return segundos;
    }

    public static void main(String[] args) {
        Tiempo segundos1 = new Tiempo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el numero de segundos");
        segundos1.segundos = leer.nextDouble();
        System.out.println("El numero de segundos es: "+segundos1.getSegundos()+"seg");
    }

}
