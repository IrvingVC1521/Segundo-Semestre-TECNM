package CURSOPROGGGGG;

import java.util.Scanner;

public class Cod2Agua {
    public static void main(String[] args) {
        int valor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 1 para agua caliente, 2 para agua al tiempo, 3 para fria");
        valor = leer.nextInt();
        if (valor == 0)
            System.out.println("Dar agua caliente");

        if (valor == 1)
            System.out.println("Dar agua al tiempo");
        else
            System.out.println("Dar agua fria");

    }
}


