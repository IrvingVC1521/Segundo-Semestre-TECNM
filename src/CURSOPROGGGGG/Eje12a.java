package CURSOPROGGGGG;

public class Eje12a {
    public static void main(String[] args) {


    int []vector = {69,34,18,6,21,48,30,3,56,0,2,90,5,45,1};
    int aux= 0;
   int j = 0;
   int ult = 0;
    boolean ban;
     while(j <vector.length-1){
        ban = true;
        if(vector[j] > vector[j+1]) {
            aux = vector[j];
            vector[j] = vector[j + 1];
            vector[j + 1] = aux;
            ban = false;
            //if (ult < j + 1) ult = j + 1;
        }

        if( (ban == false) && (j!=0)) j--;
        else  j++;

    } //Ojala supiera declarar mi amor, yo solo sé declarar variables
        for(int k = 0; k<vector.length; k++)
        System.out.print(vector[k]+ " ");
}
        }