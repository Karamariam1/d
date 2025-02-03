package com.universia.gestion_demande.dao;

import com.universia.gestion_demande.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandeDao extends JpaRepository<Demande, Integer> {
    List<Demande> findByTypeContaining(String type);
}
