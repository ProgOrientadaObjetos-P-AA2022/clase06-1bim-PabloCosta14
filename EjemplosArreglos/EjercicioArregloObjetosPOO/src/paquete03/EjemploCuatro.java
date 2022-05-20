/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Calificacion;

/**
 *
 * @author UTPL
 */
public class EjemploCuatro {
     public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[3];
        
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");
        Calificacion c3 = new Calificacion(5.1, "Base de datos");
        
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        calificaciones[2] = c3;
       double suma = 0; 
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            suma = suma + objetoCalificacion.obtenerNota();
                   }
        double promedio = suma /calificaciones.length;
         System.out.printf("%.4f\n",promedio);
         
         //--------------------------------------------------------------
         for (int i = 0; i < calificaciones.length; i++) {
             Calificacion objetoCalificacion = calificaciones[i];
             
         }
         
    }
    
}
