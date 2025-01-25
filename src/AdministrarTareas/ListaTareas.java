package AdministrarTareas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    public static void main(String[] args) {
        ArrayList<Tarea>Tareas = new ArrayList<>();
        int opcion;
        do{
        opcion =menu();
        switch (opcion){
            case 1:
                agregarTarea(Tareas);
                break;
            case 2:
                verTareas(Tareas);
                break;
            case 3:
                marcarTareaCompletada(Tareas);
                break;
            case 4:
                eliminarTarea(Tareas);
                break;
            case 5:
                System.out.println("BAY BAY BAYYYYYYY");
                break;
        }
        }while (opcion!=5);
    }

    private static void eliminarTarea(ArrayList<Tarea>Tareas) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese el ID de la tarea que desea eliminar");
            int id = leer.nextInt();
            for (Tarea tarea : Tareas) {
                if (id == tarea.id)
                    Tareas.remove(tarea);
                System.out.println("Tarea eliminada");
            }
        }catch (Exception e){
            System.out.println("Error al eliminar la tarea");
        }
    }

    private static void marcarTareaCompletada(ArrayList<Tarea>Tareas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tarea que desea marcar como completada");
        try {
            int id = leer.nextInt();
            for (Tarea tareas : Tareas) {
                if (id == tareas.id) {
                    tareas.estado = "Completada";
                    System.out.println("Tarea marcada como completada");
                } else
                    System.out.println("Tarea no encontrada");
            }
        }catch (Exception e){
            System.out.println("Error al marcar la tarea como completada");
        }
    }

    private static void verTareas(ArrayList<Tarea>Tareas) {
     if(Tareas.isEmpty())
         System.out.println("No hay tareas disponibles para ver");

        System.out.println("Lista de tareas pendientes:");
     for(Tarea tareas: Tareas) {
         if (tareas.getEstado().equalsIgnoreCase("Pendiente"))
             System.out.println(tareas);
     }
     System.out.println("Lista de tareas completadas:");
     for(Tarea tareas: Tareas) {
         if (tareas.getEstado().equalsIgnoreCase("Completada"))
             System.out.println(tareas);
     }

    }

    private static void agregarTarea(ArrayList<Tarea>Tareas) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la tarea que desea agregar a la lista");
            String tareaa = leer.nextLine();
            System.out.println("Ingrese el ID de la tarea");
            int id = leer.nextInt();
            String estado = "Pendiente";
            Tarea tarea = new Tarea(tareaa, estado, id);
            Tareas.add(tarea);
            System.out.println("Tarea agregada a la lista");
        }catch (Exception e){
            System.out.println("Error al agregar la tarea");
        }

    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        int opcion;
        try {
            System.out.println("------MENU------");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            do {
                System.out.println("Ingresa tu opcion: ");
                opcion = leer.nextInt();

                if (opcion < 1 || opcion > 5)
                    System.out.println("Opcion no valida, vuelva a intentarlo...");
            } while (opcion < 1 || opcion > 5);

            return opcion;
        }catch (Exception e){
            System.out.println("Error al ingresar la opcion");
            return 0;
        }
    }
}
