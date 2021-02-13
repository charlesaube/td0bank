package com.example.td0bank.repositories;

import com.example.td0bank.model.CompteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Long> {
}
