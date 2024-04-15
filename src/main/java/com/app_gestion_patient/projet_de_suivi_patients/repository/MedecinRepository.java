package com.app_gestion_patient.projet_de_suivi_patients.repository;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    // Vous pouvez définir des méthodes supplémentaires pour effectuer des opérations spécifiques si nécessaire
}
