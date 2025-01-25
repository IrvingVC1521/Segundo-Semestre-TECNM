package Canciones;

public class pruebaCancion {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        /*public Cancion (){
        nombre = " ";
        artista = " ";
        duracion = 0;
        Cuando hacemos esto Cancion cancion1 = new Cancion();, invocamos lo de arriba.
         */
        Cancion cancion2 = new Cancion("Pero que necesidad", "Juan Gabriel",4.2);
       /* public Cancion(String nombre, String artista, double duracion){
            this.nombre = nombre;
            this.artista = artista;
            this.duracion = duracion;
          Cancion 2 invoca al metodo de arriba
        */
        Cancion cancion3 = new Cancion("Un millón de primaveras");
        /*    public Cancion(String nombre){
        this.nombre = nombre;
        artista = "";
        duracion = 0;
        Cancion3 invoca lo de arriba
        */
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
        System.out.println(cancion3.toString());
    }
    }


