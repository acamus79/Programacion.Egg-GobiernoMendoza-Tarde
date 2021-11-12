/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.biblioteca.repositorios;

import com.mza.biblioteca.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Adrian E. Camus
 */
@Repository
public interface RepoLibro extends JpaRepository<Libro, String>{
// con esta query se obtiene contenido parecido a, LIKE %?1% remplaza a LIKE :variable
    @Query("SELECT p from Libro p WHERE p.titulo LIKE %?1% or p.autor.nombre LIKE %?1% or p.editorial.nombre LIKE %?1%")
    List<Libro> buscar(@Param("buscar") String buscar);
    
//de esta manera al buscar para encontrar resultado se debe usar contenido exacto    
//    @Query("SELECT p from Libro p WHERE p.titulo LIKE :buscar or p.autor.nombre LIKE :buscar or p.editorial.nombre LIKE :buscar")
//    List<Libro> buscar(@Param("buscar") String buscar);
    
}
