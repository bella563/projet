package com.app_gestion_patient.projet_de_suivi_patients.controller;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Medecin;
import com.app_gestion_patient.projet_de_suivi_patients.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medecins")
public class MedecinController {

    @Autowired
    private MedecinService medecinService;

    // Ajouter un médecin
    @PostMapping("/ajouter")
    public Medecin ajouterMedecin(@RequestBody Medecin medecin) {
        return medecinService.ajouterMedecin(medecin);
    }

    // Modifier un médecin
    @PutMapping("/modifier/{id}")
    public Medecin modifierMedecin(@PathVariable Long id, @RequestBody Medecin medecin) {
        return medecinService.modifierMedecin(id, medecin);
    }

    // Supprimer un médecin
    @DeleteMapping("/supprimer/{id}")
    public void supprimerMedecin(@PathVariable Long id) {
        medecinService.supprimerMedecin(id);
    }
}
