package Canciones;

import java.util.ArrayList;

public class Cadenas {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        int casilla;
        nombres.add("Monet");
        nombres.add("Luz");
        nombres.add("Marisollll");
        nombres.addFirst("Victor");
        casilla = nombres.indexOf("Monet"); //Devuelve la posicion  del elemento de la lista
        System.out.println("Casilla " +casilla);
        nombres.remove(1); //Elimina a un elemento de la lista
        System.out.println(nombres);
        for(String nombre: nombres){
            System.out.println(nombre);
        }
    }
}
