/*
 * nombre, edad, username, password, playlists , favoritos. Las playlists y favoritos no se agregarán en esta sección.  
 */
package examen2_joseluispereirao;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String usuario;
    private ArrayList<playlist>playlist;
    private ArrayList<String>favoritos;

    public Usuario(String nombre, int edad, String usuario, ArrayList<playlist> playlist, ArrayList<String> favoritos) {
        this.nombre = nombre;
        this.edad = edad;
        this.usuario = usuario;
        this.playlist = playlist;
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<String> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<String> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", usuario=" + usuario + ", playlist=" + playlist + ", favoritos=" + favoritos + '}';
    }
    
    
    
    
}
