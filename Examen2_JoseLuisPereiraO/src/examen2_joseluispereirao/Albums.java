/*
 *Los albums tienen un nombre, un artista y una lista de canciones 
 */
package examen2_joseluispereirao;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Albums {
    private String nombre;
    private String artista;
    private ArrayList<Canciones>canciones;

    public Albums(String nombre, String artista, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Albums{" + "nombre=" + nombre + ", artista=" + artista + ", canciones=" + canciones + '}';
    }
    
    
    
    
}
