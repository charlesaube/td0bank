package com.example.td0bank.services;

import com.example.td0bank.model.Gestionnaire;

import java.util.List;
import java.util.Optional;

public interface GestionnaireService {
    Gestionnaire create(Gestionnaire gestionnaire);

    Optional<Gestionnaire> readOne(Long numBureau);

    List<Gestionnaire> readAll();

    void delete(Long numBureau);
}
