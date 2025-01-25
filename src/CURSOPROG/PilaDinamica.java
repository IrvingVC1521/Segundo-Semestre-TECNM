package CURSOPROG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Nodo {
    Nodo apuntador;
    int caja;

    public Nodo(int dato) {
        caja = dato;
        apuntador = null;
    }
}

public class PilaDinamica {

    static Nodo tope;

    public PilaDinamica() {
        tope = null;
    }

    public static Nodo crear(int valor) {
        Nodo caja = new Nodo(valor);
        return caja;
    }

    public static void agregar(int valor) {

        Nodo caja = crear(valor);
        if (tope == null)
            tope = caja;
        else {
            caja.apuntador = tope;
            tope = caja;
        }
    }
    public static void mostrar(){
        Nodo aux = tope;
        while (aux != null) {
            System.out.print(aux.caja + " ->");
            aux = aux.apuntador;
        }
        System.out.println("null");
    }
    public static void eliminar(){
        if (tope == null) {
            System.out.println("pila vacia");
        }else tope = tope.apuntador;
    }

    public static void main(String[] args) throws IOException {
        int dato = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (dato != 4) {
            System.out.println("1.- Agregar \n 2.- Mostrar \n 3.- Eliminar \n 4.- Salir");
            dato = Integer.parseInt(entrada.readLine());
            switch (dato) {
                case 1:
                    System.out.println("Dame valor para el nodo");
                    agregar(Integer.parseInt(entrada.readLine()));
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    eliminar();
                    break;
            }
        }
    }


}
