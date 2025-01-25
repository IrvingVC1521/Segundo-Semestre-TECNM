package Canciones;

public class Cancion {
    private String nombre;
    private String artista;
    private double duracion;

    /*Método constructor: inicializa las variables del objeto, lleva el mismo nombre que la clase,
    no lleva tipo de dato de retorno.
    Puede haber mas de un metodo constructor.
     Cuando el programador no crea un metodo constructor java lo agrega, en automático lo crea por default
     Cuando el programador crea metodos constructores, java no agrega el metodo constructor por default
     */
    /*Método constructor por default: Es el que inicia en cero las variables numéricas y en cadenas vacias
    los de tipo String */
    public Cancion (){
        nombre = " ";
        artista = " ";
        duracion = 0;
    }
    public Cancion(String nombre, String artista, double duracion){
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion; //Se refiere a los atributos del objeto que estamos creando
    }
    public Cancion(String nombre){
        this.nombre = nombre;
        artista = "";
        duracion = 0;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista() {
        return artista;
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    public double getDuracion() {
        return duracion;
    } //Todos los set y get son los metodos accesores, son las ventanas que nos permiten llegar a esas variables
    public String toString(){
        return "Nombre cancion: " + nombre + "\nArtista: " + artista +
                "\nDuracion: " + duracion + " minutos ";
        //tostring devuelve una cadena con la lista de atributos y valores
    }
}
