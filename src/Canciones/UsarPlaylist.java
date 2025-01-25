package Canciones;

public class UsarPlaylist {
    public static void main(String[] args) {
        PlayList miLista = new PlayList("Relaxx");
        Cancion nueva = new Cancion("Moises", "Andy A", 4.6);
        miLista.agregarCancion(nueva);

        nueva = new Cancion("El potro","HOO", 2.32);
        miLista.agregarCancion(nueva);
        nueva = new Cancion("Te quiero", "Yop", 8.9);
        miLista.agregarCancion(nueva);
        nueva = new Cancion("Chamoy","Moisito", 2.34);
        miLista.agregarCancion(nueva);
        nueva = new Cancion("Vida en el espejo","Enjambre", 4.32);
        miLista.agregarCancion(nueva);

        miLista.mostrarPlaylist();


     }
}
