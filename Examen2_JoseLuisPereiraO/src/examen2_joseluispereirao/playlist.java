/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_joseluispereirao;

import java.util.ArrayList;

/**
 *nombre a la playlist y las canciones las agregará 
 */
public class playlist {
    private String nombre;
    private ArrayList<Canciones>canciones;

    public playlist(String nombre, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "playlist{" + "nombre=" + nombre + ", canciones=" + canciones + '}';
    }
    
    
    
    
}
