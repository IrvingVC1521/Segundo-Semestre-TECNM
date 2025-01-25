package Practicas;

public class Asignatura {
    private String nombre;
    private int codigoNum;
    private int semestre;

    public String getNombre() {
        return nombre;
    }

    public int getCodigoNum() {
        return codigoNum;
    }

    public int getSemestre() {
        return semestre;
    }

    public Asignatura(String nombre, int codigoNum, int semestre){
        this.nombre = nombre;
        this.codigoNum = codigoNum;
        this.semestre = semestre;
    }

}
