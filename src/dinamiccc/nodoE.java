package dinamiccc;

public class nodoE {
    nodoE Izq, Der;
    int caja;

    public nodoE(int dato) {
        caja = dato;
        Izq = Der = null;
    }
}