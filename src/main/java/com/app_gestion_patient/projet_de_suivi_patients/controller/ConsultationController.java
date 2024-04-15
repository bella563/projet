package com.app_gestion_patient.projet_de_suivi_patients.controller;

import com.app_gestion_patient.projet_de_suivi_patients.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Consultation;

import java.util.Optional;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationRepository consultationRepository;

    // Ajouter une consultation
    @PostMapping("/ajouter")
    public ResponseEntity<Consultation> ajouterConsultation(@RequestBody Consultation consultation) {
        Consultation nouvelleConsultation = consultationRepository.save(consultation);
        return new ResponseEntity<>(nouvelleConsultation, HttpStatus.CREATED);
    }

    // Modifier une consultation
    @PutMapping("/modifier/{id}")
    public ResponseEntity<Consultation> modifierConsultation(@PathVariable Long id, @RequestBody Consultation consultationDetails) {
        Optional<Consultation> consultationOpt = consultationRepository.findById(id);
        if (consultationOpt.isPresent()) {
            Consultation consultation = consultationOpt.get();
            consultation.setDate(consultationDetails.getDate());
            consultation.setHeure(consultationDetails.getHeure());
            consultation.setNomPatient(consultationDetails.getNomPatient());
            consultation.setStatus(consultationDetails.getStatus());
            final Consultation consultationModifiee = consultationRepository.save(consultation);
            return ResponseEntity.ok(consultationModifiee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Supprimer une consultation
    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimerConsultation(@PathVariable Long id) {
        consultationRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
