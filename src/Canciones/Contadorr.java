package Canciones;

public class Contadorr {
    int Numero;

    public void setValor(int x){
        this.Numero = x;
    }
    public int getValor(){
        return Numero;
    }
    public void incrementa(){
        this.Numero++;
    }
    public void incrementa(int i){
        this.Numero += i;
    }
    //El constructor es Contador.
    public Contadorr(){
        this.Numero = 0;
    }
    public boolean esMayor(Contadorr b){
        return this.Numero > b.getValor();
    }
}
