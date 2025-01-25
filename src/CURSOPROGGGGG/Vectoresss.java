package CURSOPROGGGGG;

public class Vectoresss {
    public static void main(String[] args) {
        char []vectorG = {'a','!','0','9','q','"','#','2','w','b','@','8'};
        char vectorL[] = new char[4];
         char vectorN[] = new char[4];
         char vectorS[] = new char[4];
        int lec, num, sin;
        lec = num = sin = 0;
        for(int gen = 0; gen< vectorG.length; gen++){
            if(((vectorG[gen] >= 'a') && (vectorG[gen] <= 'z')) ||
                    ((vectorG[gen] >= 'A') && (vectorG[gen] <= 'Z')))
                vectorL[lec++] = vectorG[gen];
            else
                if(((vectorG[gen] >= '!') && (vectorG[gen] <= '/')) ||
                        ((vectorG[gen] >= ':') && (vectorG[gen] <= '@')))
                vectorS[sin++] = vectorG[gen];
            else
                vectorN[num++] = vectorG[gen];
        }
        for(int j = 0; j<vectorL.length; j++)
            System.out.print(vectorL[j]);
        System.out.println(" ");
        for(int j = 0; j<vectorN.length; j++)
            System.out.print(vectorN[j]);
        System.out.println(" ");
        for(int j = 0; j<vectorS.length; j++)
            System.out.print(vectorS[j]);
    }
}
