package com.app_gestion_patient.projet_de_suivi_patients.repository;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {
    // Ajoutez des méthodes spécifiques de requête si nécessaire
}
