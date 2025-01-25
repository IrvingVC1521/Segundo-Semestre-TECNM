package CURSOPROGGGGG;

public class EJE8 {
    public static void main(String[] args) {
        int []vector = {8,19,3,6,2,21,4};
        int []vector2 = {0,0,0,0,0,0,0};
        int aux = 0;
        int posicion = 0;
        int pos = 0;
        for (int k = 0; k < vector.length; k++) {
            for (int i = 0; i < vector.length; i++) {
                if (aux < vector[i]) {
                    aux = vector[i];
                    posicion = i;
                }
            }
            vector2[pos++] = aux;
            vector[posicion] = aux = 0;
        }
        for(int i = 0; i < vector2.length; i++)
            System.out.println(vector2[i]);
    }
}
