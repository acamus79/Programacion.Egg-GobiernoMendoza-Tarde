/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

clase Pelicula con el titulo, director y duración de 
la película (en horas)

 */
package guia07_ej_04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracionHs;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracionHs) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHs = duracionHs;
    }

    public double getDuracionHs() {
        return duracionHs;
    }

    public void setDuracionHs(int duracionHs) {
        this.duracionHs = duracionHs;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
