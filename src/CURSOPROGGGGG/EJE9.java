package CURSOPROGGGGG;

public class EJE9 {
    public static void main(String[] args) {
        int [] primo = {2,3,7,11,13,17,23};
        int numA = 3;
        int numB = 8;
        int numC = 13;
        int i= 0;
        int mcm = 1;
        boolean ban1,ban2,ban3;
        while((numA != 1) || (numB !=1) || (numC != 1)){
            ban1 = ((numA % primo[i]) ==0);
            ban2 = ((numB % primo[i]) ==0);
            ban3 = ((numC % primo[i]) ==0);

            if(ban1 == true) numA /= primo[i];
            if(ban2 == true) numB /= primo[i];
            if(ban3 == true) numC /= primo[i];
            System.out.println(numA + " "+numB+ " "+numC);
            if((ban1 == false) && (ban2 == false) && (ban3 == false)) i++;
            else mcm *= primo[i];
        }
        System.out.println(mcm);
    }
}
