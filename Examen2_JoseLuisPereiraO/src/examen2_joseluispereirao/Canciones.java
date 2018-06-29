/*
 * Nombre, artista, duración (en segundos), genero.  
 */
package examen2_joseluispereirao;

/**
 *
 * @author j0c3lwiz
 */
public class Canciones {
    private String nombre;
    private String artista;
    private double duracion;
    private String genero;

    public Canciones(String nombre, String artista, double duracion, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    

    
}
