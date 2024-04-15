package com.app_gestion_patient.projet_de_suivi_patients.repository;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<Dossier, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées si nécessaire
}
