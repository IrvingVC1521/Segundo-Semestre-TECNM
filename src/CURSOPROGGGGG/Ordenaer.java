package CURSOPROGGGGG;

public class Ordenaer {
    public static void main(String[] args) {
        int []vector = {69,34,18,6,21,48,30,3,56,0,90,5};
        int aux = 0;
        for(int i = 1; i< vector.length; i++)
            for(int j = 0; j< vector.length - i; j++)
                if (vector[j] > vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
        for(int k = 0; k< vector.length; k++)
            System.out.println(vector[k] + " ");
    }
}
