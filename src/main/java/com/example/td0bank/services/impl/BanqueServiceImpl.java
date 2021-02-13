package com.example.td0bank.services.impl;

import com.example.td0bank.model.Banque;
import com.example.td0bank.repositories.BanqueRepository;
import com.example.td0bank.services.BanqueService;

import java.util.List;
import java.util.Optional;

public class BanqueServiceImpl implements BanqueService {

    private  final BanqueRepository banqueRepository;

    public BanqueServiceImpl(BanqueRepository banqueRepository) {
        this.banqueRepository = banqueRepository;
    }

    @Override
    public Banque create(Banque banque) {
        return banqueRepository.save(banque);
    }

    @Override
    public Optional<Banque> readOne(Long Id) {
        return banqueRepository.findById(Id);
    }

    @Override
    public List<Banque> readAll() {
        return banqueRepository.findAll();
    }

    @Override
    public void delete(Long Id) {
        banqueRepository.deleteById(Id);
    }
}
