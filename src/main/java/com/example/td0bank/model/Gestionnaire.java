package com.example.td0bank.model;

import com.example.td0bank.model.enumeration.Sexe;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestionnaire")
public class Gestionnaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numBureau;

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
    @Column(name = "identifiant")
    @NonNull
    private String identifiant;

    @Column(name = "motDePasse")
    @NonNull
    private String motDePasse;

    @OneToMany(cascade = CascadeType.ALL)
    private  List<Client> clients;

    public Gestionnaire(String nom, String prenom, String numTelephone, String email, Sexe sexe, int numBureau, String identifiant, String motDePasse) {
        this.numBureau = numBureau;
        this.clients = new ArrayList<Client>();
        this.identifiant = identifiant;
        this.motDePasse =motDePasse;
    }

    public Gestionnaire() { }

    public String AjouterNouveauClient(Client client){
        if(this.clients.size() < 5){
            this.clients.add(client);
            return "Client ajouter avec succes";
        }
        return "Vous possèder deja 5 clients";
    }

    public double ConsulterSoldeClient(){
        System.out.println("");
        System.out.println("Quel client souhaiter vous consulter? Saisissez son numéro de client.");
        clients.forEach(client -> System.out.println("Numéro client: "+client.getNumClient()+" Nom: "+client.getNom()+", "+client.getPrenom()));
        Client client = this.clients.stream()
                .filter(c -> c.getNumClient() == 1)
                .findFirst()
                .orElse(null);

        return 12;
    }
    public boolean CheckIfPasswordIsRight(String motDePasse){
        if(this.motDePasse.equals(motDePasse))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Gestionnaire{" +
                "numBureau=" + numBureau +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTelephone='" + numTelephone + '\'' +
                ", email='" + email + '\'' +
                ", sexe=" + sexe +
                ", identifiant='" + identifiant + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", clients=" + clients +
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

    public int getNumBureau() {
        return numBureau;
    }

    public void setNumBureau(int numBureau) {
        this.numBureau = numBureau;
    }

    @NonNull
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(@NonNull String identifiant) {
        this.identifiant = identifiant;
    }

    @NonNull
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(@NonNull String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
