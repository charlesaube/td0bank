package com.example.td0bank.repositories;

import com.example.td0bank.model.Banque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<Banque, Long> {
}
