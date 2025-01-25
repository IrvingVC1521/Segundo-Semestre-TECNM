package Canciones;

import java.util.Scanner;

public class listaCanciones {
    public static void main(String[] args) {
        Cancion []listaCanciones = new Cancion[5];
        crearLista(listaCanciones);
        mostrar(listaCanciones);
    }

    private static void mostrar(Cancion[] listaCanciones) {
        int contador = 1;
        for(Cancion cancion: listaCanciones){
            System.out.println("Cancion: " + contador+ " "+ cancion.toString());
            contador++;
        }
    }

    private static void crearLista(Cancion[] listaCanciones) {
        Scanner leerCad = new Scanner(System.in);
        Scanner leerNum = new Scanner(System.in);
        String auxCadena;
        double auxNum;
        Cancion cancion;
        for(int i =0; i<listaCanciones.length; i++){
        cancion = new Cancion();
        //Se lee el nombre de la cancion
            System.out.println("Nombre de la cancion: ");
            auxCadena = leerCad.nextLine();
            cancion.setNombre(auxCadena);
            //Se lee el nombre del artista
            System.out.println("Artista: ");
            auxCadena = leerCad.nextLine();
            cancion.setArtista(auxCadena);
            //Se lee la duracion
            System.out.println("Duracion: ");
                auxNum = leerNum.nextDouble();
                cancion.setDuracion(auxNum);
//Se asigna la cancion al vector
         listaCanciones[i] = cancion;
        }
    }
}
