package com.example.td0bank.services.impl;

import com.example.td0bank.model.Adresse;
import com.example.td0bank.repositories.AdresseRepository;
import com.example.td0bank.services.AdresseService;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService {

    private final AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository addressRepository) {
        this.adresseRepository = addressRepository;
    }

    @Override
    public Adresse create(Adresse address) {
        return adresseRepository.save(address);
    }

    @Override
    public Optional<Adresse> readOne(Long codePostal) {
        return adresseRepository.findById(codePostal);
    }

    @Override
    public List<Adresse> readAll() {
        return adresseRepository.findAll();
    }

    @Override
    public void delete(Long codePostal) {
        adresseRepository.deleteById(codePostal);
    }
}
