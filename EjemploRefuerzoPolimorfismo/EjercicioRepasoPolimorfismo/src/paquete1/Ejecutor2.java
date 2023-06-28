/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        String[] nombres = {"Austin", "Monique", "Glen", "Richard", "Patrick"};
        String[] apellidos = {"Martinez", "Lyons", "Kim", "Tate", "Lee"};
        int[] edad = {9, 70, 35, 23, 10};
        double pasajeFijo = 0.4;
        Persona p1;
        String nom = "";
        String app = "";
        int anios = 0;
        /*
        Generar un proceso que permita iterar los arreglos; el objetivo es 
        crear objetos de tipo Pasaje Menor de edad, Pasaje Normal, Pasaje 
        Universitario y Pasaje Tercera Edad. Los arreglos tienen una 
        característica, las posiciones se corresponden; por ejemplo, todas las 
        posiciones 0, crearán un objeto de cualquiera de los tipos nombrados de
        Pasajes.
        Cada objeto creado será agregado a la lista pasajes.
        
        ¿Cómo saber a que tipo de Pasaje pertenece cada objeto? Usar la edad 
        como discriminatoria.
        
        menor de edad: mayor o igual a 0 y menor o igual a 18
        universitario: mayor a 18 y menor o igual a 25
        normal: mayor a 25 y menor 65
        tercera edad: mayor o igual a 65
        
         */
        // inicio de solución
        for (int i = 0; i < nombres.length; i++) {
            if (edad[i] >= 0 && edad[i] <= 18) {
                nom = nombres[i];
                app = apellidos[i];
                anios = edad[i];
                p1 = new Persona(nom, app, anios);

                PasajeMenorEdad pasajeMenor = new PasajeMenorEdad(pasajeFijo);
                pasajeMenor.establecerPersona(p1);
                pasajes.add(pasajeMenor);
            } else if (edad[i] > 18 && edad[i] <= 25) {
                nom = nombres[i];
                app = apellidos[i];
                anios = edad[i];
                p1 = new Persona(nom, app, anios);

                PasajeUniversitario pasajeUni = new PasajeUniversitario(pasajeFijo);
                pasajeUni.establecerPersona(p1);
                
                pasajes.add(pasajeUni);
            } else if (edad[i] > 25 && edad[i] <= 65) {
                nom = nombres[i];
                app = apellidos[i];
                anios = edad[i];
                p1 = new Persona(nom, app, anios);

                PasajeNormal pasajeNor = new PasajeNormal(pasajeFijo);
                pasajeNor.establecerPersona(p1);
                
                pasajes.add(pasajeNor);
            } else if (edad[i] >= 65) {
                nom = nombres[i];
                app = apellidos[i];
                anios = edad[i];
                p1 = new Persona(nom, app, anios);

                PasajeTerceraEdad pasajeTer = new PasajeTerceraEdad(pasajeFijo);
                pasajeTer.establecerPersona(p1);
                
                pasajes.add(pasajeTer);
            }
        }

        // fin  de solución
        // no incrementar líneas de código desde aquí
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValorPasaje();
        }

        for (int i = 0; i < pasajes.size(); i++) {
            System.out.printf("%s\n",
                    pasajes.get(i));
        }
        
    }
}
