package com.example.td0bank.services.impl;

import com.example.td0bank.model.Client;
import com.example.td0bank.repositories.ClientRepository;
import com.example.td0bank.services.ClientService;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> readOne(Long numClient) {
        return clientRepository.findById(numClient);
    }

    @Override
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    public void delete(Long numClient) {
        clientRepository.deleteById(numClient);
    }
}
