package com.example.td0bank.services;

import com.example.td0bank.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client create(Client client);

    Optional<Client> readOne(Long numClient);

    List<Client> readAll();

    void delete(Long numClient);
}
