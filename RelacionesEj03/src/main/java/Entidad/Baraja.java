/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicio.Servicio;
import java.util.HashSet;

/**
 *
 * @author roser
 */
public class Baraja {
    private HashSet<Carta> baraja;

    public Baraja() {
    }

    public Baraja(HashSet baraja) {
        this.baraja = baraja;
    }

    public HashSet getBaraja() {
        return baraja;
    }

    public void setBaraja(HashSet baraja) {
        this.baraja = baraja;
    }
}
