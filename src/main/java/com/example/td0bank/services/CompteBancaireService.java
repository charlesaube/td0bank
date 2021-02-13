package com.example.td0bank.services;

import com.example.td0bank.model.CompteBancaire;

import java.util.List;
import java.util.Optional;

public interface CompteBancaireService {
    CompteBancaire create(CompteBancaire compteBancaire);

    Optional<CompteBancaire> readOne(Long numero);

    List<CompteBancaire> readAll();

    void delete(Long numero);
}
