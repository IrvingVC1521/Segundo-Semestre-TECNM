package Canciones;
import java.util.Scanner;
public class PruebadeContador {
    public static void main(String[] args) {
        Contadorr contador1 = new Contadorr();
        Contadorr contador2 = new Contadorr();
        Scanner leer = new Scanner(System.in);
        int Numero;

        //Agregar valor:
        System.out.println("Ingresa valor: ");
        Numero = leer.nextInt();
        contador1.setValor(Numero);
        //Mostrar valor:
        System.out.println("Valor de contador: "+contador1.getValor());
        //Incrementar valor dos veces:
        contador1.incrementa();
        contador1.incrementa();
        //Incrementa contador 2:
        contador2.incrementa();
        //Muestra los nuevos valores:
        System.out.println("Valor incrementado contador 1: "+contador1.getValor());
        System.out.println("Valor incrementado contador 2: "+contador2.getValor());
        //Comparar:
        if(contador1.esMayor(contador2)){
            System.out.println("Contador 1 es mayor que contador 2");
        }
        else{
            System.out.println("Contador 2 es mayor que contador 1 o son iguales");
        }
    }
}