package Unidad1;

import java.util.Scanner;

public class Tarjeta {

    private String nombre;
    private double saldoTarj;
    private double limite;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoTarj() {
        return saldoTarj;
    }

    public void setSaldoTarj(double saldoTarj) {
        this.saldoTarj = saldoTarj;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public Tarjeta(){
        nombre = "";
        saldoTarj = 50000;
        limite = 80000;
    }
    public  Tarjeta(String nombre, double saldoTarj, double limite){
        this.nombre = nombre;
        this.saldoTarj = saldoTarj;
        this.limite = limite;
    }
    public double abonar(double abono){
        saldoTarj += abono;
        System.out.println("Se ha reintegrado: " + abono + " Nuevo saldo: " + saldoTarj);
        return saldoTarj;
    }
    public double registrarCompra(double monto){
        if (saldoTarj >= monto) {
                saldoTarj -= monto;
                System.out.println("Se ha registrado una compra por: " + monto + ". Nuevo saldo: " + saldoTarj);
        } else {
            System.out.println("Saldo insuficiente para realizar la compra.");
        }
        return saldoTarj;
    }
    public String toString() {
        return " " +"\n"+
                "Nombre: " + nombre + "\n" +
                "Saldo: " + saldoTarj + "\n" +
                "limite: " + limite;
    }
}
