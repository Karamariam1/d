package com.universia.gestion_demande.dao;

import com.universia.gestion_demande.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Integer> {
    public List<Client> findClientByDemandes_Id(Integer demandeId);

    public List<Client> findClientByNomContaining(String nom);
}
