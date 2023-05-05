/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpersona;

/**
 *
 * @author roser
 */
public class Dni {
    private Character serie;
    private int numero;

    public Dni() {
    }

    public Dni(Character serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public Character getSerie() {
        return serie;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }

}
