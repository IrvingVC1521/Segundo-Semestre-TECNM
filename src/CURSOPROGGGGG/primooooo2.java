package CURSOPROGGGGG;

public class primooooo2 {
    public static void main(String[] args) {
        int aux;
        int primo = 4;
        int contador = 0;
        for(int i =2; i < primo; i++){
            aux = primo % i;
            if(aux == 0)
                contador++;
        }
        if(contador ==0)
            System.out.println("Es un primo ujuuuuuuum");
        else
            System.out.println("No es tu prima weyyy");
    }
}
