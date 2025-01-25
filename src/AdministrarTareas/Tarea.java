package AdministrarTareas;

public class Tarea {
    String Tarea, estado;
    int id;

    public Tarea(String tarea, String estado, int id) {
        Tarea = tarea;
        this.estado = estado;
        this.id = id;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String tarea) {
        Tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tarea: " +
                Tarea + '\'' +
                ", estado: " + estado + '\'' +
                ", id:" + id;
    }
}
