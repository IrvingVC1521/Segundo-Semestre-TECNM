package Canciones;

import java.util.ArrayList;

public class PlaylistDinamica {
        private String nombre;
        private ArrayList<Cancion> listaCanciones;
        //Constructor por defecto
        public PlaylistDinamica(){
            nombre = " ";
            listaCanciones = new ArrayList<>();
        }
        public PlaylistDinamica(String nombre){
            this.nombre = nombre;
            listaCanciones = new ArrayList<>();
        }
        public void agregarCancion(Cancion cancion){
            listaCanciones.add(cancion);
        }
        public int buscarCancion(String nombre){
            int posicion = -1;
            int  i = 0;
            for(Cancion cancion: listaCanciones){
                if(cancion.getNombre().equalsIgnoreCase(nombre)){
                    posicion = i;
                    break;
                }
                i++;
            }
            return posicion;
        }
        public void eliminarCancion(String cancion){
            int posicion;
            posicion = buscarCancion(nombre);
        }
    }


