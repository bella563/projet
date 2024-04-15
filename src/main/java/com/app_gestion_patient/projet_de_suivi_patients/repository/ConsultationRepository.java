package com.app_gestion_patient.projet_de_suivi_patients.repository;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}