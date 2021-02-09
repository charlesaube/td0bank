package com.example.td0bank.model;


import com.example.td0bank.model.enumeration.TypeCompte;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "compteBancaire")
public class CompteBancaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    @NonNull
    private TypeCompte type;

    @Column(name = "soldeInitial")
    private double soldeInitial;

    @Column(name = "soldeActuel")
    private double soldeActuel;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client propriétaire;

    public CompteBancaire(int numero, TypeCompte type, double soldeInitial,Client propriétaire) {
        this.numero = numero;
        this.type = type;
        this.soldeInitial = soldeInitial;
        this.propriétaire = propriétaire;
        this.soldeActuel = soldeInitial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @NonNull
    public TypeCompte getType() {
        return type;
    }

    public void setType(@NonNull TypeCompte type) {
        this.type = type;
    }

    public double getSoldeInitial() {
        return soldeInitial;
    }

    public void setSoldeInitial(double soldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    public double getSoldeActuel() {
        return soldeActuel;
    }

    public void setSoldeActuel(double soldeActuel) {
        this.soldeActuel = soldeActuel;
    }

    public Client getPropriétaire() {
        return propriétaire;
    }

    public void setPropriétaire(Client propriétaire) {
        this.propriétaire = propriétaire;
    }
}
