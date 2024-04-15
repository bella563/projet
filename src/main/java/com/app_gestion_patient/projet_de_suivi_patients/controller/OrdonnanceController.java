package com.app_gestion_patient.projet_de_suivi_patients.controller;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Ordonnance;
import com.app_gestion_patient.projet_de_suivi_patients.service.OrdonnanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordonnances")
public class OrdonnanceController {

    @Autowired
    private OrdonnanceService ordonnanceService;

    // Endpoint pour obtenir toutes les ordonnances
    @GetMapping
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceService.getAllOrdonnances();
    }

    // Endpoint pour obtenir une ordonnance par son ID
    @GetMapping("/{id}")
    public Ordonnance getOrdonnanceById(@PathVariable Long id) {
        return ordonnanceService.getOrdonnanceById(id);
    }

    // Endpoint pour ajouter une nouvelle ordonnance
    @PostMapping
    public Ordonnance addOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.addOrdonnance(ordonnance);
    }

    // Endpoint pour modifier une ordonnance existante
    @PutMapping("/{id}")
    public Ordonnance updateOrdonnance(@PathVariable Long id, @RequestBody Ordonnance ordonnance) {
        return ordonnanceService.updateOrdonnance(id, ordonnance);
    }

    // Endpoint pour supprimer une ordonnance
    @DeleteMapping("/{id}")
    public void deleteOrdonnance(@PathVariable Long id) {
        ordonnanceService.deleteOrdonnance(id);
    }
}
