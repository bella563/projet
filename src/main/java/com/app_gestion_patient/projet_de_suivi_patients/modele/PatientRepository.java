package com.app_gestion_patient.projet_de_suivi_patients.modele;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Vous pouvez ajouter des méthodes spécifiques au besoin
}
