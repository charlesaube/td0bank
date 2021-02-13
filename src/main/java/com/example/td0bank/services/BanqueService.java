package com.example.td0bank.services;

import com.example.td0bank.model.Banque;


import java.util.List;
import java.util.Optional;

public interface BanqueService {
    Banque create(Banque banque);

    Optional<Banque> readOne(Long Id);

    List<Banque> readAll();

    void delete(Long Id);
}
