/*
 * nombre, edad, username, password, playlists , favoritos. Las playlists y favoritos no se agregarán en esta sección.  
 */
package examen2_joseluispereirao;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Usuario implements Serializable{
    private String nombre;
    private int edad;
    private String usuario;
    private String contra;
    private ArrayList<playlist>playlist;
    private ArrayList<String>favoritos;
    
 private static final long SerialVersionUID=777L;
    public Usuario(String nombre, int edad, String usuario, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.usuario = usuario;
        this.contra = contra;
        this.playlist = playlist;
        this.favoritos = favoritos;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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
        return nombre;
    }

    
    
    
    
    
}
