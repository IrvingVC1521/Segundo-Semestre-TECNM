package Canciones;

import java.util.ArrayList;

public class arreglosDinamicos {
    public static void main(String[] args) {
        ArrayList <Integer> listaNumeros = new ArrayList<>(); //Se crea el arraylist
        listaNumeros.add(1); // se agrega el numero 1 a la lista
        listaNumeros.add(2);
        listaNumeros.add(3);

        System.out.println("El contenido de la lista es: " +listaNumeros);
        for(int valor=100; valor <= 1000; valor+=100)
        listaNumeros.add(valor);

        System.out.println(listaNumeros);
        System.out.println("Tamaño de la lista: " +listaNumeros.size());
        listaNumeros.set(3,2000); //En la casilla 3 de la lista se guarda un 2000

        //listaNumeros.set(20,1); no se  puede asignar porque no existe  la casilla 20
    }
}
