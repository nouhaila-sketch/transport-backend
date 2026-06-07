package com.transport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lignes")
public class Ligne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomLigne;      
    private String stationDepart;  
    private String stationArrivee; 


    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomLigne() {
        return nomLigne;
    }

    public void setNomLigne(String nomLigne) {
        this.nomLigne = nomLigne;
    }

    public String getStationDepart() {
        return stationDepart;
    }

    public void setStationDepart(String stationDepart) {
        this.stationDepart = stationDepart;
    }

    public String getStationArrivee() {
        return stationArrivee;
    }

    public void setStationArrivee(String stationArrivee) {
        this.stationArrivee = stationArrivee;
    }
}