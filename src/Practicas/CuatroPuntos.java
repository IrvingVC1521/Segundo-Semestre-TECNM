package Practicas;

public class CuatroPuntos {
    private double puntoX;
    private double puntoY;

    public double getPuntox() {
        return puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public CuatroPuntos(double puntoX, double puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    public CuatroPuntos() {
        puntoX = 0;
        puntoY = 0;
    }

    public double DistanciaEntreDosPuntos(CuatroPuntos punto2, CuatroPuntos punto3) {
        double X = punto3.getPuntox() - punto2.getPuntox();
        double Y = punto3.getPuntoY() - punto2.getPuntoY();
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }
    @Override
    public String toString(){
        return "{" +
                "x=" + puntoX +
                ", y=" +puntoY+
                "}";
    }
}


