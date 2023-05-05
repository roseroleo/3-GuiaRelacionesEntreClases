/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre. 
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos
 */
public class ServicioCine {

    Scanner lr = new Scanner(System.in);
    ArrayList<Espectador> espec = new ArrayList<>();
    String[][] sala = new String[8][6];

    //Ingresar datos de la pelicula
    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula("Titanic", 3, 16, "James Cameron");
        return p;
    }

    //Ingresar datos del cine
    public Cine crearCine() {
        Pelicula p = crearPelicula();
        Cine c = new Cine(p, espec, 300);
        return c;
    }

    //Ubicar los espectadores dentro de la sala aleatoriamente
    public void crearEspectador(int n) {

        //Ingresar datos del espectador
        for (int i = 0; i < n; i++) {
//                System.out.println("Ingrese nombre ");
//                String nombre = lr.next();
//                System.out.println("Ingrese edad ");
//                int edad = lr.nextInt();
//                System.out.println("Ingrese dinero disponible ");
//                double dinero = lr.nextDouble();
//                Espectador e = new Espectador(nombre,edad,dinero);
//                espec.add(e);

            //Artificio para crear espectadores
            Espectador e = new Espectador("P" + String.valueOf(i), (int) (Math.random() * 70), Math.random() * 1000);
            espec.add(e);
        }
    }

    public void llenarSala(int n) {

        //Iniciamos el arreglo de sillas vacias
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = "       ";
            }
        }

        //Asignamos aleatoriamente una silla vacia al espectador
        int espectador = 0;
        String esp = "";
        while (espectador < n) {
            if (cumpleRequisitos(espectador)) {
                int fila = (int) (Math.random() * 8);
                int col = (int) (Math.random() * 6);
//                System.out.println("fila = " + fila + "col = " + col);
                if (sala[fila][col].equals("       ")) { //Verifica si la silla esta vacia y se asigna si es así
                    if (espectador < 10) { //Verificar si el # es de un solo digito para llenar con 0 el espacio
                        esp = "0" + String.valueOf(espectador);
                    } else {
                        esp = String.valueOf(espectador);
                    }
                    //Asignar la nomenclatura de la silla al espectador
                    sala[fila][col] = String.valueOf(fila + 1) + String.valueOf((char) (col + 65)) + "->E" + esp;
                    espectador++;
                }
            } else {
                System.out.println("Espectador " + espectador + " no cumple los requisitos Edad/Dinero");
                espectador++;
            }
        }
    }

    //Verificar si el espectador cumple los requisitos
    public boolean cumpleRequisitos(int n) {
        Cine c1 = crearCine();
        Pelicula p1 = crearPelicula();
//        System.out.println("Edad minima " + p1.getEdad() + " Precio " + c1.getPrecio());
//        System.out.println("edad " + espec.get(n).getEdad() + " dinero " + espec.get(n).getDinero());
        boolean cumple = false;

        if (espec.get(n).getDinero() > c1.getPrecio() && espec.get(n).getEdad() > p1.getEdad()) {
            cumple = true;
        }
        return cumple;
    }

    //Mostrar sala
    public void mostrarSala() {
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + sala[i - 1][j] + "] ");
            }
            System.out.println("");
        }
    }
}
