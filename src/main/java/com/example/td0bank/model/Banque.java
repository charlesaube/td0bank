package com.example.td0bank.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "banque")
public class Banque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "nom")
    @NonNull
    private String nom;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Client> clients;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Gestionnaire> gestionnaires;

    public Banque(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<Client>();
        this.gestionnaires = new ArrayList<Gestionnaire>();
    }

    public Banque() {

    }

    public Gestionnaire FindManger(String identifiant){
        return      this.gestionnaires.stream()
                .filter(u -> u.getIdentifiant().equals(identifiant))
                .findFirst()
                .orElse(null);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Gestionnaire> getGestionnaires() {
        return gestionnaires;
    }

    public void setGestionnaires(List<Gestionnaire> gestionnaires) {
        this.gestionnaires = gestionnaires;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @NonNull
    public String getNom() {
        return nom;
    }

    public void setNom(@NonNull String nom) {
        this.nom = nom;
    }


}
