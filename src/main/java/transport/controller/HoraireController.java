package com.transport.controller;

import com.transport.model.Horaire;
import com.transport.repository.HoraireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/horaires")
@CrossOrigin(origins = "*")
public class HoraireController {

    @Autowired
    private HoraireRepository horaireRepository;

    @GetMapping
    public List<Horaire> getAllHoraires() {
        return horaireRepository.findAll();
    }

    @PostMapping
    public Horaire createHoraire(@RequestBody Horaire horaire) {
        return horaireRepository.save(horaire);
    }

    @DeleteMapping("/{id}")
    public void deleteHoraire(@PathVariable Long id) {
        horaireRepository.deleteById(id);
    }
}