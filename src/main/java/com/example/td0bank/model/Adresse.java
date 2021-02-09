package com.example.td0bank.model;

import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "adresse")
public class Adresse implements Serializable {
    @Id
    @Column(name = "codePostal")
    private String codePostal;

    @Column(name = "numCivique")
    @NonNull
    private int numCivique;

    @Column(name = "rue")
    @NonNull
    private String rue;

    @Column(name = "ville")
    @NonNull
    private String ville;

    public Adresse(int numCivique, String rue, String ville, String codePostal) {
        this.numCivique = numCivique;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public Adresse() { }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public int getNumCivique() {
        return numCivique;
    }

    public void setNumCivique(int numCivique) {
        this.numCivique = numCivique;
    }

    @NonNull
    public String getRue() {
        return rue;
    }

    public void setRue(@NonNull String rue) {
        this.rue = rue;
    }

    @NonNull
    public String getVille() {
        return ville;
    }

    public void setVille(@NonNull String ville) {
        this.ville = ville;
    }
}
