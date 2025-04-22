package com.ejemplo.novedades.controller;

import com.ejemplo.novedades.model.NovedadRuta;
import com.ejemplo.novedades.service.SolicitarNovedadRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/novedades")
public class SolicitarNovedadRutaController {

    private final SolicitarNovedadRutaService novedadRutaService;

    @Autowired
    public SolicitarNovedadRutaController(SolicitarNovedadRutaService novedadRutaService) {
        this.novedadRutaService = novedadRutaService;
    }

    @GetMapping
    public List<NovedadRuta> obtenerNovedades() {
        return novedadRutaService.obtenerNovedades();
    }

    @GetMapping("/{id}")
    public Optional<NovedadRuta> obtenerNovedadPorId(@PathVariable Long id) {
        return novedadRutaService.obtenerNovedadPorId(id);
    }

    @PostMapping
    public NovedadRuta guardarNovedad(@RequestBody NovedadRuta novedadRuta) {
        return novedadRutaService.guardarNovedad(novedadRuta);
    }
}
