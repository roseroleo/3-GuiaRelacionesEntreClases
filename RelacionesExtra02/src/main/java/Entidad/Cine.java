/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/*película que se está reproduciendo, la 
sala con los espectadores y el precio de la entrada
 */
 
public class Cine {
    private Pelicula pelicula;
    private ArrayList<Espectador> espec;
    private double precio;

    public Cine() {
    }

    public Cine(Pelicula pelicula, ArrayList<Espectador> espec, double precio) {
        this.pelicula = pelicula;
        this.espec = espec;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspec() {
        return espec;
    }

    public void setEspec(ArrayList<Espectador> espec) {
        this.espec = espec;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
