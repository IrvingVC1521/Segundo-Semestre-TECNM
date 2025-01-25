package CURSOPROGGGGG;

public class ordenarShell {
    public static void main(String[] args) {
        int []vector = {69,34,18,6,21,48,30,3,56,0,2,90,5,45,1};
        int aux= 0;
        int pivo = vector.length/2;
        boolean ban;
        while(pivo != 0){
            for(int i =0; i<vector.length - pivo; i++)
                if(vector[i] > vector[i+pivo]){
                    aux = vector[i];
                    vector[i] = vector[i+pivo];
                    vector[i+pivo] = aux;
                }
            else{
                    int j = 0;
                    while(j <vector.length-1){
                        ban = true;
                        if(vector[j] > vector[j+1]){
                            aux = vector[j];
                            vector[j] = vector[j+1];
                            vector[j+1] = aux;
                            ban = false;
                        }
                        if( (ban == false) && (j!=0)) j--;
                       else  j++;

                    }
            }pivo /=2;
        }
        for(int k = 0; k<vector.length; k++)
            System.out.print(vector[k]+ " ");
    }
}
