/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.relacionesej01;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class RelacionesEj01 {

    public static void main(String[] args) {
        Persona pers = new Persona();
        ArrayList<Persona> personas = crearPersona();
        ArrayList<Perro> mascotas = crearPerro();
        
        //Asignar una mascota a cada persona
        Iterator<Persona> it = personas.iterator();
        int c = 0;
        while (it.hasNext()) {
            Persona p = it.next();
            p.setPerro(mascotas.get(c));
            c++;
        System.out.println(p.toString());
        }
    }

    //Crear personas y asignar una mascota
    public static ArrayList<Persona> crearPersona() {
        ArrayList<Persona> pers = new ArrayList();
        Persona p1 = new Persona("Pedro", "Perez", 20, 1111);
        Persona p2 = new Persona("Lola", "Lila", 30, 2222);
        pers.add(p1);
        pers.add(p2);
        return pers;
    }

    //Crear perros
    public static ArrayList<Perro> crearPerro() {
        ArrayList<Perro> mascota = new ArrayList<>();
        Perro m1 = new Perro("Sol", "Cooker", 1, "Mediano");
        Perro m2 = new Perro("Nano", "Snawzer", 12, "Mediano");
        mascota.add(m1);
        mascota.add(m2);
        return mascota;
    }
}
