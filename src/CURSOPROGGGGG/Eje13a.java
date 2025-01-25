package CURSOPROGGGGG;

public class Eje13a {
    public char [][]MatrizA = new char[3][3];
    public  char [][]MatrizB = {{'1','2','3'}, {'4','5','6'},{'7','8','9'}};
    public void intercambio(){
        for(int i =0; i<3; i++)
            for(int j =0; j<3;j++)
                MatrizA[j][i] = MatrizB[i][j];

    }
    public void mostrar(){
        for(int i =0; i<3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(MatrizB[i][j] + " ");
            System.out.println(MatrizB[i][i]);
        }
        for(int i =0; i<3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(MatrizA[i][j] + " ");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Eje13a obj = new Eje13a();
        obj.intercambio();
        obj.mostrar();
        }
    }

