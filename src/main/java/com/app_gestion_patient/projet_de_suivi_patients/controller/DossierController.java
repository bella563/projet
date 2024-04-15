package com.app_gestion_patient.projet_de_suivi_patients.controller;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Dossier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dossiers")
public class DossierController {

    private service.DossierService dossierService;

    // Récupérer tous les dossiers
    @GetMapping
    public List<Dossier> getAllDossiers() {
        return dossierService.getAllDossiers();
    }

    // Ajouter un nouveau dossier
    @PostMapping
    public Dossier createDossier(@RequestBody Dossier dossier) {
        return dossierService.createDossier(dossier);
    }

    // Modifier un dossier existant
    @PutMapping("/{id}")
    public Dossier updateDossier(@PathVariable Long id, @RequestBody Dossier dossierDetails) {
        return dossierService.updateDossier(id, dossierDetails);
    }

    // Supprimer un dossier
    @DeleteMapping("/{id}")
    public void deleteDossier(@PathVariable Long id) {
        dossierService.deleteDossier(id);
    }
}
