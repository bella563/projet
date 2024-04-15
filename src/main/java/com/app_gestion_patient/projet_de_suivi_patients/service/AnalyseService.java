package com.app_gestion_patient.projet_de_suivi_patients.service;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Analyse;
import com.app_gestion_patient.projet_de_suivi_patients.repository.AnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalyseService {

    @Autowired
    private AnalyseRepository analyseRepository;

    public List<Analyse> getAllAnalyses() {
        return analyseRepository.findAll();
    }

    public Optional<Analyse> getAnalyseById(Long id) {
        return analyseRepository.findById(id);
    }

    public Analyse addAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    public Analyse updateAnalyse(Long id, Analyse newAnalyse) {
        if (analyseRepository.existsById(id)) {
            newAnalyse.setId(id);
            return analyseRepository.save(newAnalyse);
        }
        return null;
    }

    public void deleteAnalyse(Long id) {
        analyseRepository.deleteById(id);
    }
}

