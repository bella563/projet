package com.app_gestion_patient.projet_de_suivi_patients.modele;

import java.time.LocalDate;

public class Analyse {

    private Long id;
    private String nom;
    private String description;
    private LocalDate dateAnalyse;
    private String resultat;
    private Long medecinId;

    // Constructeurs
    public Analyse() {}

    public Analyse(String nom, String description, LocalDate dateAnalyse, String resultat, Long medecinId) {
        this.nom = nom;
        this.description = description;
        this.dateAnalyse = dateAnalyse;
        this.resultat = resultat;
        this.medecinId = medecinId;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateAnalyse() {
        return dateAnalyse;
    }

    public void setDateAnalyse(LocalDate dateAnalyse) {
        this.dateAnalyse = dateAnalyse;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Long getMedecinId() {
        return medecinId;
    }

    public void setMedecinId(Long medecinId) {
        this.medecinId = medecinId;
    }

    @Override
    public String toString() {
        return "Analyse{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", dateAnalyse=" + dateAnalyse +
                ", resultat='" + resultat + '\'' +
                ", medecinId=" + medecinId +
                '}';
    }
}
