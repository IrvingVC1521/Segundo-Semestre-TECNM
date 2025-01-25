package Practicas;

import java.util.Scanner;

public class Huesped {
     private String nombre;
    private  int numeroHab;
    private int diasHospedaje;
    private  int alimentosyBebidas;
    private int costoHabitacion;
    private  int llamadas;
    private int monto;
    private int montoLlamada;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumeroHab(int numeroHab){
        this.numeroHab = numeroHab;
    }
    public int getNumeroHab(){
        return numeroHab;
    }
    public void setDiasHospedaje(int diasHospedaje){
        this.diasHospedaje = diasHospedaje;
    }
    public int getDiasHospedaje(){
        return diasHospedaje;
    }
    public void setAlimentosyBebidas(int alimentosyBebidas){
        this.alimentosyBebidas = alimentosyBebidas;
    }
    public int getAlimentosyBebidas(){
        return alimentosyBebidas;
    }
    public void setLlamadas(int llamadas){
        this.llamadas = llamadas;
    }
    public int getLlamadas() {
        return llamadas;
    }
    public void setCostoHabitacion(int costoHabitacion){
        this.costoHabitacion = costoHabitacion;
    }
    public int getCostoHabitacion(){
        return costoHabitacion;
    }
     public Huesped(String nombre, int numeroHab, int diasHospedaje, int costoHabitacion){
        this.nombre = nombre;
        this.numeroHab = numeroHab;
        this.diasHospedaje = diasHospedaje;
        this.costoHabitacion = costoHabitacion;
        alimentosyBebidas = 0;
        llamadas = 0;
     }

    public Huesped(){
    nombre = " ";
    numeroHab = 0;
    diasHospedaje = 0;
    alimentosyBebidas = 0;
    costoHabitacion = 0;
    llamadas = 0;
    }
    public int agregarLlamadas(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el monto de tu llamada");
        montoLlamada = leer.nextInt();
        llamadas += montoLlamada;
        System.out.println("El monto de tu llamada es: " +montoLlamada);
        return llamadas;
    }
    public void agregarConsumoAYB(){
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Agrega el monto de tu consumo de alimentos y bebidas");
        alimentosyBebidas = leer2.nextInt();
        alimentosyBebidas = alimentosyBebidas + monto;
        System.out.println("El monto de tus alimentos y bebidas es: "+alimentosyBebidas);
    }
    public void totalAPagar(){
        monto = diasHospedaje * costoHabitacion + alimentosyBebidas + llamadas;
        System.out.println("El total a pagar es: "  +monto);
    }

}
