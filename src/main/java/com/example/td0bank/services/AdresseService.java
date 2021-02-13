package com.example.td0bank.services;

import com.example.td0bank.model.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    Adresse create(Adresse address);

    Optional<Adresse> readOne(Long codePostal);

    List<Adresse> readAll();

    void delete(Long codePostal);
}
