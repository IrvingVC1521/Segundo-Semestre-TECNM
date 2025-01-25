package Practicas;

public class EjercicioAsignatura {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("Matematicas", 1017, 1);
        System.out.println("Asignatura: " + asignatura.getNombre());
        System.out.println("Código númerico: " +asignatura.getCodigoNum());
        System.out.println("Semestre: " +asignatura.getSemestre());
    }
}
