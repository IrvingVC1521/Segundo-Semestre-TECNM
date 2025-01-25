package ArchivosBinariosCursoProg;
import java.io.BufferedReader;
import  java.io.IOException;
import java.io.*;
public class Arc {
    public File archivo = null;
    public FileReader lector = null;
    public FileWriter escribir = null;
    public BufferedReader buff = null;
    public  PrintWriter buffes = null;

    public void leer(){
        try{
            archivo = new File("datos.txt");
            lector = new FileReader(archivo);
            buff = new BufferedReader(lector);
            String linea;
            while((linea = buff.readLine()) != null){
                System.out.println(linea);
            }
            buff.close();
            lector.close();
            archivo = null;
        } catch (Exception e) {
            System.out.println("Hubo un error al leer el archivo");
        }
    }
    public void escribir(){
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        int dato = 0;
        try{
            archivo = new File("datos.txt");
            escribir = new FileWriter(archivo);
            buffes = new PrintWriter(escribir);
            while(dato != 2){
                System.out.println("Ingrese un valor para el archivo");
                buffes.println(Integer.parseInt(entrada.readLine()));
                System.out.println("1.- Escribir, 2.- Salir");
                dato = Integer.parseInt(entrada.readLine());
            }
            buffes.close();
            escribir.close();
            archivo = null;
        } catch (Exception e) {
            System.out.println("Hubo un error al escribir el archivo");
        }
    }

    public static void main(String[] args) throws IOException {
        Arc arc = new Arc();
        int dato = 0;
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        while(dato != 3){
            System.out.println("");
            System.out.println("1.- Escribir, 2.- Leer, 3.- Salir");
            dato = Integer.parseInt(entrada.readLine());
            switch(dato){
                case 1:
                    arc.escribir();
                    break;
                case 2:
                    arc.leer();
                break;
                case 3:
                    System.out.println("Adios bb");
                    break;
            }
        }

    }
}