package com.app_gestion_patient.projet_de_suivi_patients.controller;
import com.app_gestion_patient.projet_de_suivi_patients.modele.PatientRepository;
import com.app_gestion_patient.projet_de_suivi_patients.modele.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient newPatient) {
        return patientRepository.findById(id)
                .map(patient -> {
                    patient.setNom(newPatient.getNom());
                    patient.setPrenom(newPatient.getPrenom());
                    patient.setAge(newPatient.getAge());
                    return patientRepository.save(patient);
                })
                .orElseGet(() -> {
                    newPatient.setId(id);
                    return patientRepository.save(newPatient);
                });
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
    }
}
