package com.app_gestion_patient.projet_de_suivi_patients.service;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Ordonnance;
import com.app_gestion_patient.projet_de_suivi_patients.repository.OrdonnanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdonnanceService {

    @Autowired
    private OrdonnanceRepository ordonnanceRepository;

    // Méthode pour obtenir toutes les ordonnances
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceRepository.findAll();
    }

    // Méthode pour obtenir une ordonnance par son ID
    public Ordonnance getOrdonnanceById(Long id) {
        Optional<Ordonnance> ordonnanceOptional = ordonnanceRepository.findById(id);
        return ordonnanceOptional.orElse(null);
    }

    // Méthode pour ajouter une nouvelle ordonnance
    public Ordonnance addOrdonnance(Ordonnance ordonnance) {
        return ordonnanceRepository.save(ordonnance);
    }

    // Méthode pour modifier une ordonnance existante
    public Ordonnance updateOrdonnance(Long id, Ordonnance updatedOrdonnance) {
        Optional<Ordonnance> ordonnanceOptional = ordonnanceRepository.findById(id);
        if (ordonnanceOptional.isPresent()) {
            updatedOrdonnance.setId(id);
            return ordonnanceRepository.save(updatedOrdonnance);
        }
        return null;
    }

    // Méthode pour supprimer une ordonnance
    public void deleteOrdonnance(Long id) {
        ordonnanceRepository.deleteById(id);
    }
}

