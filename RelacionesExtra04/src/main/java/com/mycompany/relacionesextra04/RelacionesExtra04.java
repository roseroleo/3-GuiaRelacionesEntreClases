/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relacionesextra04;

import Entidad.Alumno;
import Servicio.Simulador;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class RelacionesExtra04 {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        Simulador s1 = new Simulador();
        System.out.println("Ingrese el numero de alumnos ");
        int n = lr.nextInt();
        ArrayList<String> nom = s1.generarNombres(n);
        HashSet<Integer> dni = s1.generarDni(n);
        Alumno al = s1.generarAlumno(nom,dni);
        
        s1.imprimirLista(nom);
                
        System.out.println("Hello World!");
    }
}
