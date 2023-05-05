package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roser
 */
public class Servicio {

    //Crear baraja (40 cartas en desorden)
    public HashSet<Carta> Barajar() {
        HashSet<Carta> baraja = new HashSet<>();
        String p = "";
        Baraja b = new Baraja();
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    p = "Oros";
                    break;
                case 1:
                    p = "Copas";
                    break;
                case 2:
                    p = "Bastos";
                    break;
                case 3:
                    p = "Espadas";
                    break;
            }
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    baraja.add(new Carta(p, j));
                }
            }
        }
        return baraja;
    }
    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta(HashSet<Carta> b) {
        Iterator it = b.iterator();
        if (!b.isEmpty()) {
            System.out.println("Siguiente carta " + it.next());
        } else {
            System.out.println("No hay mas cartas en el mazo");
        }
    }

    //Mostrar las cartas que componen el mazo
    public void mostrarBaraja(HashSet<Carta> b) {
        int cont = 0;
        System.out.println("Tamaño de la baraja " + b.size());
        for (Carta aux : b) {
            System.out.println(cont + " " + aux);
            cont++;
        }
    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(HashSet<Carta> b) {
        System.out.println("Cartas disponibles " + (40 - b.size()));
    }

    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    public ArrayList<Carta> darCartas(HashSet<Carta> b) {
        Scanner lr = new Scanner(System.in);
        int n = 0;
        ArrayList<Carta> cartasJugador = new ArrayList<>();
        System.out.println("Indique cuantas cartas desea pedir ");
        n = lr.nextInt();
        Iterator it = b.iterator();
        if (n < b.size()) {
            System.out.println("Sus cartas son ");
            for (int i = 0; i < n; i++) {
                Carta carta = (Carta) it.next();
                cartasJugador.add(carta);
                it.remove();
                System.out.println(i + "" + carta);
            }
        } else {
            System.out.println("No hay esa cantidad de cartas disponibles");
        }
        return cartasJugador;
    }

    //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario 
    public void cartasMonton(ArrayList<Carta> cartasJugador) {
        if (cartasJugador.size() > 0) {
            System.out.println("Cartas que ya salieron ");
            for (Carta aux : cartasJugador) {
                System.out.println(aux);
            } 
        }else{
            System.out.println("No ha salido carta alguna hasta el momento");
        }
    }

}
