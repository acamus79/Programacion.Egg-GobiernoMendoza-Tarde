/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package libreria.entidades;

import com.sun.istack.internal.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Adrian E. Camus
 */
@Entity
public class Editorial {
    @Id
    @GeneratedValue
    private String id;
    
    @NotNull 
    @Column(unique = true)
    private Integer codEditorial;
    
    @NotNull 
    @Column(unique = true)
    private String nombre;
    
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(String id, Integer codEditorial, String nombre, Boolean alta) {
        this.id = id;
        this.codEditorial = codEditorial;
        this.nombre = nombre;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(Integer codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }
    
    
    
}