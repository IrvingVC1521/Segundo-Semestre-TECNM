package CURSOPROGGGGG;

import java.util.Scanner;

public class Switchhh {
    public static void main(String[] args) {
        int valor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 1 para agua caliente, 2 para agua al tiempo, 3 para fria");
        valor = leer.nextInt();
        switch (valor){
            case 1:
                System.out.println("Dar agua caliente");
                break;
            case 2:
                System.out.println("Dar agua al tiempo");
                break;
            case 3:
                System.out.println("Te vas a enfermar, dar agua fria");
                break;
            default:
                System.out.println("Ingresaste un caracter no válido");
        }
    }
}
