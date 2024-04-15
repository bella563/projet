package com.app_gestion_patient.projet_de_suivi_patients.repository;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse, Long> {
}
