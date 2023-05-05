/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.relacionesextra01;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona. 
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
public class RelacionesExtra01 {

    public static void main(String[] args) {
        //Crear lista de personas y de perros
        Persona pers = new Persona();
        ArrayList<Persona> personas = crearPersona();
        ArrayList<Perro> mascotas = crearPerro();

        //Asignar una mascota a cada persona
        Iterator<Persona> it = personas.iterator();
        Iterator<Perro> itP = mascotas.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            while (itP.hasNext()) {
                int c = (int) (Math.random() * mascotas.size()); 
                System.out.println("azar "+c);
                if (mascotas.contains(mascotas.get(c))) {
                    p.setPerro(mascotas.get(c)); //Asigna una mascota al azar
                    mascotas.remove(c); //Elimina la mascota asignada porque ya no esta disponible
                    break;
                } else {
                    System.out.println("La mascota ya ha sido asignada a otra persona");
                    System.out.println("Presione una tecla para recibir otra");
                }
            }
            System.out.println(p.toString());
        }
    }
    //Crear personas y asignar una mascota

    public static ArrayList<Persona> crearPersona() {
        ArrayList<Persona> pers = new ArrayList();
        Persona p1 = new Persona("Pedro", "Perez", 20, 1111);
        Persona p2 = new Persona("Lola", "Lila", 30, 2222);
        Persona p3 = new Persona("Pablo", "Angel", 35, 333);
        Persona p4 = new Persona("James", "Rodriguez", 33, 444);
        Persona p5 = new Persona("Jerry", "Mina", 28, 5555);
        Persona p6 = new Persona("Radamel", "Falcao", 34, 6666);
        Persona p7 = new Persona("Guillermo", "Cuadrado", 29, 7777);
        Persona p8 = new Persona("David", "Ospina", 36, 8888);
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);
        pers.add(p4);
        pers.add(p5);
        pers.add(p6);
        pers.add(p7);
        pers.add(p8);
        return pers;
    }

    //Crear perros
    public static ArrayList<Perro> crearPerro() {
        ArrayList<Perro> mascota = new ArrayList<>();
        Perro m1 = new Perro("Sol", "Cooker", 1, "Mediano");
        Perro m2 = new Perro("Nano", "Snawzer", 12, "Mediano");
        Perro m3 = new Perro("Mia", "Poodle", 10, "Pequeño");
        Perro m4 = new Perro("Avril", "Snawzer", 12, "Pequeño");
        Perro m5 = new Perro("Sharki", "Poodle", 13, "Pequeño");
        Perro m6 = new Perro("Kira", "Labrador", 2, "Grande");
        Perro m7 = new Perro("Manchas", "Callejero", 6, "Mediano");
        Perro m8 = new Perro("Luna", "Chiguahua", 3, "Pequeño");
        mascota.add(m1);
        mascota.add(m2);
        mascota.add(m3);
        mascota.add(m4);
        mascota.add(m5);
        mascota.add(m6);
        mascota.add(m7);
        mascota.add(m8);
        return mascota;
    }

}
