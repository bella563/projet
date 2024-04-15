package com.app_gestion_patient.projet_de_suivi_patients.controller;

import com.app_gestion_patient.projet_de_suivi_patients.modele.Analyse;
import com.app_gestion_patient.projet_de_suivi_patients.service.AnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/analyses")
public class AnalyseController {

    @Autowired
    private AnalyseService analyseService;

    @GetMapping
    public List<Analyse> getAllAnalyses() {
        return analyseService.getAllAnalyses();
    }

    @GetMapping("/{id}")
    public Optional<Analyse> getAnalyseById(@PathVariable Long id) {
        return analyseService.getAnalyseById(id);
    }

    @PostMapping
    public Analyse addAnalyse(@RequestBody Analyse analyse) {
        return analyseService.addAnalyse(analyse);
    }

    @PutMapping("/{id}")
    public Analyse updateAnalyse(@PathVariable Long id, @RequestBody Analyse newAnalyse) {
        return analyseService.updateAnalyse(id, newAnalyse);
    }

    @DeleteMapping("/{id}")
    public void deleteAnalyse(@PathVariable Long id) {
        analyseService.deleteAnalyse(id);
    }
}
