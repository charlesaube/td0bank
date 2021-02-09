package com.example.td0bank.model;

import com.example.td0bank.model.enumeration.Sexe;
import com.example.td0bank.model.enumeration.StatutMatrimonial;
import com.example.td0bank.model.enumeration.TypeCompte;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numClient;

    @NonNull
    @Column(name = "nom")
    private String nom;

    @NonNull
    @Column(name = "prenom")
    private String prenom;

    @NonNull
    @Column(name = "numTelephone")
    private String numTelephone;

    @NonNull
    @Column(name = "email")
    private String email;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "sexe")
    private Sexe sexe;

    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;

    @Column(name = "salaire")
    private double salaire;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "statutMatrimonial")
    private StatutMatrimonial statutMatrimonial;

    @NonNull
    @Column(name = "anneeNaissance")
    private int anneeNaissance;

    @NonNull
    @Column(name = "pin")
    private int pin;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CompteBancaire> comptesBancaires;


    public Client() {

    }

    /*
    public Client(String nom, String prenom, String numTelephone, String email, Sexe sexe,
                  int numClient, Adresse adresse, double salaire, StatutMatrimonial statutMatrimonial,
                  int anneeNaissance, int pin) {
        this.numClient = numClient;
        this.adresse = adresse;
        this.salaire = salaire;
        this.statutMatrimonial = statutMatrimonial;
        this.anneeNaissance = anneeNaissance;
        this.pin = pin;
        this.comptesBancaires = new ArrayList<CompteBancaire>();
    }
*/

    public CompteBancaire NouveauCompteBancaire(int num, TypeCompte type, double soldeInitial){
        CompteBancaire newCompte = new CompteBancaire(num,type,soldeInitial,this);
        this.comptesBancaires.add(newCompte);
        return newCompte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numClient=" + numClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTelephone='" + numTelephone + '\'' +
                ", email='" + email + '\'' +
                ", sexe=" + sexe +
                ", adresse=" + adresse +
                ", salaire=" + salaire +
                ", statutMatrimonial=" + statutMatrimonial +
                ", anneeNaissance=" + anneeNaissance +
                ", pin=" + pin +
                ", comptesBancaires=" + comptesBancaires +
                '}';
    }

    @NonNull
    public String getNom() {
        return nom;
    }

    public void setNom(@NonNull String nom) {
        this.nom = nom;
    }

    @NonNull
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(@NonNull String prenom) {
        this.prenom = prenom;
    }

    @NonNull
    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(@NonNull String numTelephone) {
        this.numTelephone = numTelephone;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(@NonNull Sexe sexe) {
        this.sexe = sexe;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @NonNull
    public StatutMatrimonial getStatutMatrimonial() {
        return statutMatrimonial;
    }

    public void setStatutMatrimonial(@NonNull StatutMatrimonial statutMatrimonial) {
        this.statutMatrimonial = statutMatrimonial;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public List<CompteBancaire> getComptesBancaires() {
        return comptesBancaires;
    }

    public void setComptesBancaires(List<CompteBancaire> comptesBancaires) {
        this.comptesBancaires = comptesBancaires;
    }
}
