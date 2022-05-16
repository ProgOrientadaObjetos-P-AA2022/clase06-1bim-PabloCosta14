/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Vendedor {

    private String nombres;
    private int edad;
    private double pagoMensual;
    private double salarioMinimo;
    private int numeroAutos;
    private double comisionPorAuto;

    public Vendedor(String n, int e, double sMinimo, int nAutos) {
        nombres = n;
        edad = e;
        salarioMinimo = sMinimo;
        establecerNumeroAutos(nAutos);
        comisionPorAuto = 150;
    }

    public void establecerNombres(String c) {
        nombres = c;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public void calcularPagoMensual() {
        pagoMensual = obtenerSalarioMinimo()
                + (obtenerComisionPorAuto() * obtenerNumeroAutos());
    }

    public void establecerSalarioMinimo(double s) {
        salarioMinimo = s;
    }

    public void establecerNumeroAutos(int s) {
        numeroAutos = s;
    }

    // comisionPorAuto;
    public void establecerComisionPorAuto(double s) {
        comisionPorAuto = s;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public int obtenerEdad() {
        return edad;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public double obtenerSalarioMinimo() {
        return salarioMinimo;
    }

    public int obtenerNumeroAutos() {
        return numeroAutos;
    }

    public double obtenerComisionPorAuto() {
        return comisionPorAuto;
    }
   /* 
    @Override
    public String toString(){
        
        String cadea = String.format("Datos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n", v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());")
    return cadena    
    }*/
}
