package com.ejemplo.novedades.service;

import com.ejemplo.novedades.model.NovedadRuta;
import com.ejemplo.novedades.repository.NovedadRutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitarNovedadRutaService {

    private final NovedadRutaRepository novedadRutaRepository;

    @Autowired
    public SolicitarNovedadRutaService(NovedadRutaRepository novedadRutaRepository) {
        this.novedadRutaRepository = novedadRutaRepository;
    }

    public List<NovedadRuta> obtenerNovedades() {
        return novedadRutaRepository.findAll();
    }

    public Optional<NovedadRuta> obtenerNovedadPorId(Long id) {
        return novedadRutaRepository.findById(id);
    }

    public NovedadRuta guardarNovedad(NovedadRuta novedadRuta) {
        return novedadRutaRepository.save(novedadRuta);
    }
}
