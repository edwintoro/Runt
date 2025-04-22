package com.ejemplo.novedades.repository;

import com.ejemplo.novedades.model.NovedadRuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovedadRutaRepository extends JpaRepository<NovedadRuta, Long> {
}
