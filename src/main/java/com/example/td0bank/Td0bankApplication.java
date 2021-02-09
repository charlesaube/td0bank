package com.example.td0bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Td0bankApplication {


    private final Logger log = LoggerFactory.getLogger(Td0bankApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(Td0bankApplication.class, args);
    }

    void crudGestionnaire(){

    }
    void crudClient(){

    }
    void crudBanque(){

    }
    void crudAdresse(){

    }
    void crudCompte(){

    }
    /*
    Banque banque = new Banque("Banque du monde");

    Gestionnaire gestionnaire = new Gestionnaire("Tremblay","Paul","456-314-4567","paul.tremblay@worldbank.com","M",1,"PaulTremblay01","Abc123");
        banque.utilisateurs.add(gestionnaire);

    Adresse ad1 = new Adresse(1,"poulet","St-Hubert","W6R7U1");
    Client client1 = new Client("Dubois","France","424","francedubois@gmail.com","F",1,ad1,67000,"Célibataire",1993,1278);
    CompteBancaire cb1 = new CompteBancaire(1,"Épargne",4000,client1);
        client1.getComptesBancaires().add(cb1);
        banque.utilisateurs.add(client1);

    Adresse ad2 = new Adresse(2,"jambon","St-Hubert","P6H3U9");
    Client client2 = new Client("Sauvé","Jean","475","jean.sauve@gmail.com","M",2,ad2,88000,"Marié",1984,7620);
    CompteBancaire cb2 = new CompteBancaire(2,"Chèque",500,client2);
        client2.getComptesBancaires().add(cb2);
        banque.utilisateurs.add(client2);

    Adresse ad3 = new Adresse(3,"patate","St-Hubert","T8V5O9");
    Client client3 = new Client("Charest","Mike","541","olichar@gmail.com","M",3,ad3,140000,"Divorcé",1969,0261);
    CompteBancaire cb3 = new CompteBancaire(2,"Épargne",3500,client3);
        client3.getComptesBancaires().add(cb3);
        banque.utilisateurs.add(client3);

        gestionnaire.clients.add(client1);
        gestionnaire.clients.add(client2);
        gestionnaire.clients.add(client3);

    Gestionnaire g = LogIn(banque);

        System.out.println("Vous etes connecté en tant que " + g.getPrenom() + " " + g.getNom());
        System.out.println("========================================================================");
        System.out.println("Que voulez-vous faire? Saisissez le numéro de l'action.");
        System.out.println("");
        System.out.println("1) Ajouter un nouveau client");
        System.out.println("2) Consulter le solde du compte d’un client");
        System.out.println("3) Lister tous les clients");
        System.out.println("4) Accorder du crédit à un client");
        System.out.println("5) Ouvrir un nouveau compte à un client");
        System.out.println("6) Effectuer une opération (Ajout ou Retrait) sur le compte d’un client");

        g.ConsulterSoldeClient();
}

    private static Gestionnaire LogIn(Banque banque){
        Boolean acceptConnexion;
        String identifiant;
        String motDePasse;
        Gestionnaire g;
        int compteur = 0;
        Scanner in = new Scanner(System.in);
        do{
            compteur++;
            acceptConnexion = false;
            System.out.println("Veuillez saisir votre identifiant de Gestionnaire");
            identifiant = in.next();
            System.out.println("Veuillez saisir votre mot de passe");
            motDePasse =  in.next();
            g = banque.FindManger(identifiant);
            if(g != null)
                acceptConnexion = g.CheckIfPasswordIsRight(motDePasse);

            if(acceptConnexion) {
                System.out.println("Nombre de tentative de connection: " + compteur);
            }
            else
                System.out.println("Erreur: identifiant ou mot de passe incorrect");
        }while(!acceptConnexion);
        return g;*/


}
