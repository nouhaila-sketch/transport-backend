package com.transport.controller;

import com.transport.model.Ligne;
import com.transport.repository.LigneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lignes")
@CrossOrigin(origins = "*")
public class LigneController {

    @Autowired
    private LigneRepository ligneRepository;

    @GetMapping
    public List<Ligne> getAllLignes() {
        return ligneRepository.findAll();
    }

    @PostMapping
    public Ligne createLigne(@RequestBody Ligne ligne) {
        return ligneRepository.save(ligne);
    }

    @DeleteMapping("/{id}")
    public void deleteLigne(@PathVariable Long id) {
        ligneRepository.deleteById(id);
    }
}