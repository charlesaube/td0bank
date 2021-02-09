package com.example.td0bank.model;

import com.example.td0bank.model.enumeration.Sexe;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.*;

import java.io.Serializable;


public abstract class Utilisateur{

    private int utilisateurId;


    private String nom;

    private String prenom;

    private String numTelephone;

    private String email;

    private Sexe sexe;

    public Utilisateur(String nom, String prenom, String numTelephone, String email, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
        this.email = email;
        this.sexe = sexe;
    }

    public Utilisateur() { }

    @Override
    public String toString() {
        return  " nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTelephone='" + numTelephone + '\'' +
                ", email='" + email + '\'' +
                ", sexe='" + sexe + '\'';
    }

    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
}
