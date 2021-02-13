package com.example.td0bank.services.impl;

import com.example.td0bank.model.Gestionnaire;
import com.example.td0bank.repositories.GestionnaireRepository;
import com.example.td0bank.services.GestionnaireService;

import java.util.List;
import java.util.Optional;

public class GestionnaireServiceImpl implements GestionnaireService {

    private  final GestionnaireRepository gestionnaireRepository;

    public GestionnaireServiceImpl(GestionnaireRepository gestionnaireRepository) {
        this.gestionnaireRepository = gestionnaireRepository;
    }

    @Override
    public Gestionnaire create(Gestionnaire gestionnaire) {
        return gestionnaireRepository.save(gestionnaire);
    }

    @Override
    public Optional<Gestionnaire> readOne(Long numBureau) {
        return gestionnaireRepository.findById(numBureau);
    }

    @Override
    public List<Gestionnaire> readAll() {
        return gestionnaireRepository.findAll();
    }

    @Override
    public void delete(Long numBureau) {
        gestionnaireRepository.deleteById(numBureau);
    }
}
