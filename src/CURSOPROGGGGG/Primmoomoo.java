package CURSOPROGGGGG;

public class Primmoomoo {
    public static void main(String[] args) {
        int aux;
        int primo = 7;
        int contador = 0;
        for(int i =1; i <= primo; i++){
            aux = primo % i;
            if(aux == 0)
                contador++;
        }
        if(contador ==2)
            System.out.println("Es un primo ujuuuuuuum");
        else
            System.out.println("No es tu prima weyyy");
    }
}
