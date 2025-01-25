package Canciones;

public class PlayList {
    Cancion []vectorCanciones;
    String nombre;
    int contador;
    //Constuctor por default
    public PlayList(){
        nombre = "";
        vectorCanciones = new Cancion[5];//todas las casillas van en null
        contador = -1;
    }
    public PlayList(String nombre){
        this.nombre = nombre;
        contador = -1;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setContador(int contador){
        this.contador = contador;
    }
    public int getContador(){
        return contador;
    }
    public void setVectorCanciones(Cancion []vectorCanciones){
        this.vectorCanciones = vectorCanciones;
    }
    public Cancion[] getVectorCanciones(){
        return vectorCanciones;
    }
    public void agregarCancion(Cancion cancion){
        if(contador < vectorCanciones.length-1) {
            contador++;
            vectorCanciones[contador] = cancion;
        }
    }
    public int buscarCancion(String nombre){
       int posicion = -1;
        for(int i=0; i <= contador; i++){
            if(nombre.equalsIgnoreCase(vectorCanciones[i].getNombre())){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    public void eliminarCancion(String nombre){
        int posicion = buscarCancion(nombre);
        if(posicion != -1){
            for (int i = posicion; i<contador; i++){
                vectorCanciones[i] = vectorCanciones[i+1];
            }
            contador--;
            System.out.println("Se ha eliminado la cancion: " +nombre);
        }
        else {
            System.out.println("La cancion no fue encontrado dentro de la playlist");
        }
    }
    public void mostrarPlaylist(){
        if(contador == -1)
            System.out.println("La playlist " +nombre+ "Se encuentra vacia");
        else {
            System.out.println("...................................................................");
            System.out.println("Contenido de la playlist " +nombre+ ": ");
            System.out.println("...................................................................");
        }
        for(int i=0; i <= contador; i++){
            System.out.println(vectorCanciones[i].toString());
            System.out.println();
        }
    }
}
