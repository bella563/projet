package com.app_gestion_patient.projet_de_suivi_patients.service;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Medecin;
import com.app_gestion_patient.projet_de_suivi_patients.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedecinService {

    @Autowired
    private MedecinRepository medecinRepository;

    // Ajouter un médecin
    public Medecin ajouterMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    // Modifier un médecin
    public Medecin modifierMedecin(Long id, Medecin medecin) {
        medecin.setId(id);
        return medecinRepository.save(medecin);
    }

    // Supprimer un médecin
    public void supprimerMedecin(Long id) {
        medecinRepository.deleteById(id);
    }
}
