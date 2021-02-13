package com.example.td0bank.services.impl;

import com.example.td0bank.model.CompteBancaire;
import com.example.td0bank.repositories.CompteBancaireRepository;
import com.example.td0bank.services.CompteBancaireService;

import java.util.List;
import java.util.Optional;

public class CompteBancaireServiceImpl implements CompteBancaireService {

    private  final CompteBancaireRepository compteBancaireRepository;

    public CompteBancaireServiceImpl(CompteBancaireRepository compteBancaireRepository) {
        this.compteBancaireRepository = compteBancaireRepository;
    }

    @Override
    public CompteBancaire create(CompteBancaire compteBancaire) {
        return compteBancaireRepository.save(compteBancaire);
    }

    @Override
    public Optional<CompteBancaire> readOne(Long numero) {
        return compteBancaireRepository.findById(numero);
    }

    @Override
    public List<CompteBancaire> readAll() {
        return compteBancaireRepository.findAll();
    }

    @Override
    public void delete(Long numero) {
        compteBancaireRepository.deleteById(numero);
    }
}
